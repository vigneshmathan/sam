package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.bouncycastle.asn1.dvcs.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Crome {
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		 WebElement tbl = driver.findElement(By.xpath("//table[@class='table']"));
		 
		List<WebElement> tr = tbl.findElements(By.tagName("tr"));
		File f =new File("C:\\Users\\lenovo\\Desktop\\T20.xlsx");
		FileInputStream fi=new FileInputStream(f);
		FileOutputStream  stream=new FileOutputStream(f);
		Workbook w= new XSSFWorkbook();
		Sheet createSheet = w.createSheet("Sheet1");
		for (int i = 0; i < tr.size(); i++) {
			WebElement webElement = tr.get(i);
			
	 List<WebElement> datas = webElement.findElements(By.tagName("td"));
	 for (int j = 0; j < datas.size(); j++) {
		 WebElement data = datas.get(j);
		 
		 Row row=null;
		 if (j==0) {
			 row=createSheet.createRow(i);
			 
			
		}else {
			row=createSheet.getRow(i);
			
		}
		Cell createCell = row.createCell(j);
		String text = data.getText();
	    createCell.setCellValue(text);
	}
			
			
		}
		w.write(stream);
		System.out.println("Vicky");
		
		
		
	
		

}
}