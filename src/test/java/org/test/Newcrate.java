package org.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Newcrate {
	public static void main(String[] args) throws IOException {

		File f =new File("C:\\Users\\lenovo\\Desktop\\check.xlsx");
		FileOutputStream stream = new FileOutputStream(f);
		Workbook w=new XSSFWorkbook();
		Sheet createSheet = w.createSheet("vicky");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("ball");
		w.write(stream);
		
	}

	
	
}
