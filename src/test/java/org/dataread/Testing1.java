package org.dataread;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.text.Element;

import org.apache.poi.ss.formula.functions.IfFunc;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.helper.DataUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Testing1 {
	
	WebDriver driver; 
	
	public void TestId(String url) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);	
	}
	public WebElement Locators(String locaterType,String value) {
		if (locaterType.equals("id")) {
		WebElement findElement = driver.findElement(By.id(value));
		return findElement;

	
	}
		else if (locaterType.equals("name")) {
			WebElement findElement = driver.findElement(By.name(value));
		return findElement;
	
		
	}
		else {
			WebElement findElement = driver.findElement(By.xpath(value));
		return findElement;
		
		}	
	}
		public void entertext(WebElement  element ,String text) {
			element.sendKeys(text);
		}
		

		
		public void buttonclick(WebElement element) {
			element.click();
		}
		public String excelread( String path,String sheetName ,int rowIndex,int cellIndex) throws IOException {
			File f =new File(path);
			FileInputStream stream=new FileInputStream(f);
		    Workbook w=new XSSFWorkbook(stream);
		    Sheet sheet = w.getSheet(sheetName);
			Row row = sheet.getRow(rowIndex);
			Cell cell = row.getCell(cellIndex);
			int cellType = cell.getCellType();
			if (cellType==1) {
				String stringCellValue = cell.getStringCellValue();
			return sheetName;
			
		}
		
			else if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat s=new SimpleDateFormat("dd/mm/yy");
				String format=s.format(dateCellValue);
			return sheetName;
				
			}
			else  
			{
			double numericCellValue = cell.getNumericCellValue();
				long l=(long)numericCellValue;
			     String valueOf = String.valueOf(l);
			return valueOf;
		
		}
			
		}
		public void excelwrite(String path,String sheetName,int rowIntex,int  cellIndex,String value ) throws IOException {
			File f=new File(path);
			FileOutputStream stream =new FileOutputStream(f);
			Workbook w=new XSSFWorkbook();
			Sheet createSheet = w.createSheet( sheetName);
			Row createRow = createSheet.createRow(rowIntex);
			Cell createCell = createRow.createCell(cellIndex);
			createCell.setCellValue(value);
			w.write(stream);
			
}
		
}	
	


