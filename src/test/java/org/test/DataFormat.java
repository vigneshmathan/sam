package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.helper.DataUtil;

public class DataFormat {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\lenovo\\eclipse-workspace\\SampleFile\\Excel\\vicky.xlsx");
		
		
	FileInputStream stream=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(stream);
	Sheet sheet = w.getSheet("sheet1");
	
	int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
	for (int i = 0; i < physicalNumberOfRows; i++) {
		Row row = sheet.getRow(i);
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
	for (int j = 0; j < physicalNumberOfCells; j++) {
		Cell cell = row.getCell(j);
		
		
		
		int cellType = cell.getCellType();
		if (cellType==1) {
			String stringCellValue = cell.getStringCellValue();
			System.out.print(stringCellValue+"        ");
			
			
		}
		else if (DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();
			System.out.println(dateCellValue);
			SimpleDateFormat s=new SimpleDateFormat("MMM/dd/yy");
			String format = s.format(dateCellValue);
			System.out.print(format);
			                                                                 
		}
		else {
			double numericCellValue = cell.getNumericCellValue();
			long l=(long)numericCellValue;
			System.out.print(l);
		}
	}	
	
	
	}
	}	
	


}

