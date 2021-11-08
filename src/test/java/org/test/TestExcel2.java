package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestExcel2 {
	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\lenovo\\eclipse-workspace\\SampleFile\\Excel\\login.xlsx");
		
		FileInputStream  streem=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(streem);
		Sheet sheet = w.getSheet("Sheet1");
			for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
				 Row row2 = sheet.getRow(i);
		for (int j = 0; j <row2.getPhysicalNumberOfCells(); j++) {
    Cell cell = row2.getCell(j);
					System.out.println(cell);
					
				}	
		}
		}		
		
	}


