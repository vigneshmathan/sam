package org.dataread;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.Baseclass;

public class Bookingpage extends Baseclass {
	public  Bookingpage() {
		PageFactory.initElements(Driver(), this);
		

}
	private WebDriver Driver() {
		// TODO Auto-generated method stub
		return null;
	}
	@FindBy(id="Firstnsme")
	private WebElement Fistname;
	  @FindBy(id="Lastname") 
	private WebElement Lastname;
      @FindBy(id="Address")
	private WebElement  Address;
	
		@FindBy(id="CardNo")
	private WebElement CardNO;
	 @FindBy(id="CVVNumber")
	private WebElement CVVNumber;
	@FindBy(id="Month")
	private WebElement Month;
	@FindBy(id="Date")
	private WebElement  Date;
	
	@FindBy(id="Cardtype")
	private WebElement CardType;


	public WebElement getFistname() {
		return Fistname;
	}


	public WebElement getLastname() {
		return Lastname;
	}


	public WebElement getAddress() {
		return Address;
	}


	public WebElement getCardNO() {
		return CardNO;
	}


	public WebElement getCVVNumber() {
		return CVVNumber;
	}


	public WebElement getMonthe() {
		return Month;
	}


	public WebElement getDate() {
		return Date;
	}


	public WebElement getCardType() {
		return CardType;
	}


	
	
	
	}

	