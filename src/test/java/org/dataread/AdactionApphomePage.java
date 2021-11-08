package org.dataread;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.Baseclass;

public class AdactionApphomePage extends Baseclass {
	public AdactionApphomePage() {
      PageFactory.initElements(getdriver(), this);
      
}
	
	
	@FindBy(id="username")
	private WebElement username;
	@FindBy(id="pass")
	private WebElement password;
	@FindBy(id="login")
	private WebElement login;
	
	public WebElement getusername() {
		return login;
		
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

		// TODO Auto-generated method stub
		
	

	
	
}



		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
