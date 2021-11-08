package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.swing.text.Element;
import javax.swing.text.Highlighter.Highlight;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.fasterxml.jackson.annotation.ObjectIdGenerators.StringIdGenerator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public static WebDriver driver;
	public static String value;

	public static void TestId(String url) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
	}

	public static WebElement Locators(String locaterType, String value) {
		if (locaterType.equals("id")) {
			WebElement findElement;
			try {
				findElement = getDriver1().findElement(By.id(value));
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		else if (locaterType.equals("name")) {
			WebElement findElement = getDriver1().findElement(By.name(value));
			return findElement;
		}

		else {
			WebElement findElment = getDriver1().findElement(By.xpath(value));
			return findElment;
		}
		return null;

	}

	public void Selectebyvalue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	public void loadUrl(String Url) {
		getDriver1().get(Url);
	}

	public String getUrl() {
		return getDriver1().getCurrentUrl();
	}

	public String getcurrenturl() {
		String currentUrl = getDriver1().getCurrentUrl();
		return currentUrl;

	}

	public void dragAndDrop(WebElement source, WebElement target) {
		new Actions(getDriver1()).dragAndDrop(source, target);
	}

	public void closeAllwindow() {
		getDriver1().quit();

	}

	public void closeWindow() {
		getDriver1().close();
	}

	public void SeleciontOptionByInsex(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);

	}

	public String getAttribute(WebElement t, String value) {
		String attribute = t.getAttribute(value);
		return attribute;
	}

	public String getwindow(WebDriver driver) {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;

	}

	public String gettitle() {
		String title = getDriver1().getTitle();
		return title;

	}

	public Set<String> getWindowhandle() {
		Set<String> windowHandles = getDriver1().getWindowHandles();
		return windowHandles;

	}

	public String getPageSoure() {
		String pageSource = getDriver1().getPageSource();
		return pageSource;
	}

	public void frameS() {
		// TODO Auto-generated method stub

	}

	public void SelectoptionByValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);

	}

	public void SelectOptionByText(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByVisibleText(value);
	}

	public void getoption(WebElement element) {
		Select s = new Select(element);
		s.getOptions();

	}

	public void framewe(int index) {
		switchToElement().frame(index);

	}

	public void getSelectedOption(WebElement element) {
		Select s = new Select(element);
		s.getAllSelectedOptions();

	}

	public void deselectOption(WebElement element) {
		Select s = new Select(element);
		s.deselectAll();

	}

	public static void deselectedAll(WebElement element) {
		Select s = new Select(element);
		s.deselectAll();

	}
           public static   void deSelectByIndex(WebElement element, int index) {
		// TODO Auto-generated method stub
		Select s = new Select(element);
		s.deselectByIndex(index);
	}

	public static void deselectByvalue(WebElement element, String value) {
		// TODO Auto-generated method stub
		Select s = new Select(element);
		s.deselectByValue(value);
	}

	public static void deselectByvalue1(WebElement element, String value) {
		// TODO Auto-generated method stub
		Select s = new Select(element);
		s.deselectByValue(value);
	}

	public static void Sendkey(WebElement element) {
		// TODO Auto-generated method stub
		Actions action = new Actions(getDriver1());
		action.sendKeys(element).perform();

	}

	public static void keyDown(WebElement element) {
		Actions actions = new Actions(getDriver1());
		actions.keyDown(Keys.SHIFT).perform();

	}

	public void keyup(WebElement element) {
		Actions actions = new Actions(getDriver1());
		actions.keyUp(Keys.SHIFT).perform();

	}

	public void doubelclick(WebElement element) {
		Actions actions = new Actions(getDriver1());
		actions.doubleClick().perform();

	}

	public static void rightclick() {
		// TODO Auto-generated method stub
		Actions action = new Actions(getDriver1());
		action.contextClick().perform();
	}

	public  static void click() {
		// TODO Auto-generated method stub
		Actions action = new Actions(getDriver1());
		action.click().perform();
	}

	public static void actionclick() {
		// TODO Auto-generated method stub
		Actions action = new Actions(getDriver1());
		action.click();
	}

	public static void passtxt(WebElement element, String text) {
		// TODO Auto-generated method stub
		element.sendKeys(text);
	}

	public static void dragdrap(WebElement source, WebElement element) {
		// TODO Auto-generated method stub
		Actions actions = new Actions(getDriver1());
		actions.dragAndDrop(source, element).perform();
	}

	public static void frame(int index) {
		switchToElement().frame(index);

	}

	private static Baseclass switchToElement() {
		// TODO Auto-generated method stub
		return null;
	}

	public static WebDriver getDriver1() {
		// TODO Auto-generated method stub
		return null;
	}

	public static  void switchToElement(int intex) {
		// TODO Auto-generated method stub
		switchToElement(intex);
	}

	public static void actiontxtsend(WebElement element, String txt) {
		// TODO Auto-generated method stub
		Actions action = new Actions(getDriver1());
		action.sendKeys(element, txt).perform();
	}

	public static void action(WebElement element, String txt) {
		// TODO Auto-generated method stub
		Actions action = new Actions(getDriver1());
		action.sendKeys(element, txt).perform();
	}

	public String excelRead(String path,String sheetName,int rowindex,int cellindex) throws IOException {
		File f = new File(path);
		FileInputStream stream = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(stream);
		Sheet sheet = w.getSheet(sheetName);
		Row row = sheet.getRow(rowindex);
		Cell cell = row.getCell(cellindex);
		int cellType = cell.getCellType();
		if (cellType == 1) {
			String stringCellValue = cell.getStringCellValue();
			return stringCellValue;

		}

		else if (DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat s = new SimpleDateFormat("dd/mm/yy");
			String format = s.format(dateCellValue);
			return format;

		} else {
			double numericCellValue = cell.getNumericCellValue();
			long l = (long) numericCellValue;

		}
		return sheetName;

	}

	public static void excelwrite(String path, String sheetName, int rowIntex, int cellIndex, String value)
			throws IOException {
		File f = new File(path);
		FileOutputStream stream = new FileOutputStream(f);
		Workbook w = new XSSFWorkbook();
		Sheet createSheet = w.createSheet(sheetName);
		Row createRow = createSheet.createRow(rowIntex);
		Cell createCell = createRow.createCell(cellIndex);
		createCell.setCellValue(value);
		w.write(stream);

	}

	public WebDriver getdriver() {
		return getdriver();
	}

	public static void enterText(WebElement element, String text) {

		element.sendKeys(text);

	}

	public static void buttonclick(WebElement element) {
		element.click();

	}

	public static void btnlogin() {

	}

	public static void selectionByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	public static void SelectHotel(WebElement element,int intex) {
		Select s= new Select(element);
		 
	}

	public static void setDriver(WebDriver driver) {
		Baseclass.driver = driver;
	}


	public void excelRead(String path) {
		File f=new File(path);
}

}


