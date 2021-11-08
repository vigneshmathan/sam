package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.helper.DataUtil;

public class MavenTestj {
	public static void main(String[] args) throws IOException {
		
		
		File f=new File("C:\\Users\\lenovo\\eclipse-workspace\\SampleFile\\Excel\\table.xlsx");
		
		FileInputStream streem= new FileInputStream(f);
		
		Workbook w=new XSSFWorkbook(streem);
		Sheet sheet = w.getSheet("sheet1");
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		for (int i = 0; i <physicalNumberOfRows; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < physicalNumberOfRows; j++) {
				
				Cell cell = row.getCell(j);
				
			int cellType = cell.getCellType();
			if (cellType==1) {
				String stringCellValue = cell.getStringCellValue();
				System.out.print(stringCellValue+"    ");
				
				 {
					
				}
				
			}else {
				double numericCellValue = cell.getNumericCellValue();
				System.out.print(numericCellValue+"      ");
				
				
				long l=(long)numericCellValue;
				System.out.println(l);
			}
					
				}
		}	
	
	}

}
