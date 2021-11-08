package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenTest {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		 
		 driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("vicky");
		 driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("thala");
		 driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("345");
		 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("vickymathan@gmail.com");
		 driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("1234445556");
		 WebElement sample = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		 sample.click();
		 
		 
		// select s=new Select(x);
		 WebElement findElement = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		 findElement.click();
		 WebElement lanauage = driver.findElement(By.id("display"));
		 lanauage.click();
		 WebElement findElement2 = driver.findElement(By.xpath("(//select[@type='text'])[1]"));
		 findElement2.click();
		 WebElement findElement3 = driver.findElement(By.xpath("//option[@value=\"Analytics\"]"));
		 findElement3.click();
		 WebElement findElement4 = driver.findElement(By.xpath("//select[@ng-model='country']"));
		 findElement4.click();
		 WebElement findElement5 = driver.findElement(By.xpath("//option[@value='2000']"));
		 findElement5.click();
		 WebElement findElement6 = driver.findElement(By.xpath("//option[@value='May']"));
		 findElement6.click();
		 WebElement findElement7 = driver.findElement(By.xpath("//option[@value='3']"));
		 findElement7.click();
		 
		 
		
	}

}
