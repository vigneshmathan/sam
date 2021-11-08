package org.dataread;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.Baseclass;

public class SearcPage extends Baseclass {
	
	public SearcPage() {
		
		
		PageFactory.initElements(getdriver(), this);

}
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	
	@FindBy(id="roomtype")
	private WebElement roomtype;
	@FindBy(id="nooofroms")
	private WebElement nooofrooms;
	
	@FindBy(id="Checkoutdate")
	private WebElement Checkoutdate;
	@FindBy(id="Adultsperroom")
	private WebElement Adultsperroom;
	 @ FindBy(id="childreen")
	private WebElement childreen;
	@FindBy(id="submit")
	private WebElement submit;
	
	
	
	public WebElement getLocation() {
		return location;
	}


	public WebElement getNooofrooms() {
		return nooofrooms;
	}


	public WebElement getCheckoutdate() {
		return Checkoutdate;
	}


	public WebElement getAdultsperroom() {
		return Adultsperroom;
	}


	public WebElement getChildreen() {
		return childreen;
	}


	public WebElement getSubmit() {
		return submit;
	}


	public WebElement location() {
		return location;
		
	}


	public WebElement getHotels() {
		return hotels;
	}


	public WebElement getRoomtype() {
		return roomtype;
	}


	

	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
