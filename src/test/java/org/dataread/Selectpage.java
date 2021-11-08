package org.dataread;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.Baseclass;

public class Selectpage extends Baseclass {
	public Selectpage() {
		PageFactory.initElements(driver, this);
		
}
	@FindBy(id="buttonclick")
	private WebElement buttonclick;
	 @FindBy(id="continuepage")
	private WebElement continuepage;
	 
	public WebElement getButtonclick() {
		return buttonclick;
	}
	public WebElement getContinuepage() {
		return continuepage;
	}
	
	 
}