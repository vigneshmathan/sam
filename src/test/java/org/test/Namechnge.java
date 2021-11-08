package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Namechnge {
	public static void main(String[] args) throws IOException {
		
		File f= new File("C:\\Users\\lenovo\\eclipse-workspace\\SampleFile\\Excel\\vicky.xlsx");
		FileInputStream stream=new FileInputStream(f);
		Workbook w= new XSSFWorkbook(stream);
		
		Sheet sheet = w.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		
		String stringCellValue = cell.getStringCellValue();
		boolean equals = stringCellValue.equals("vicky");
		if (equals) {
			cell.setCellValue("thalavair");
			
		}
		FileOutputStream stream1=new FileOutputStream(f);
		w.write(stream1);
	}

}
