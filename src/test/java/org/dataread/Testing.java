package org.dataread;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.test.Baseclass;

public class Testing extends Baseclass {
	public static void main(String[] args) throws IOException {
		
		
		Testing a=new Testing();
		TestId("https://adactinhotelapp.com/");
		AdactionApphomePage a1 =new AdactionApphomePage();
		WebElement txtusername = a1.getusername();
		String username=a1.excelRead("C:\\Users\\lenovo\\eclipse-workspace\\SampleFile\\exc\\Baseclass.xlsx", "Sheet1", "0", "0");
		int parseInt = Integer.parseInt(username);
		enterText(txtusername,username);
		WebElement txtpassword = a1.getPassword(); 
		String password=a1.excel
		enterText(txtpassword, password);
		int parseInt2 = Integer.parseInt(password);
		WebElement login = a1.getLogin();
		buttonclick(login);
		
		SearcPage b=new SearcPage();	
		WebElement location = b.location();
		String index1=b.excelRead(username, password, parseInt, parseInt2);
         int parseInt3 = Integer.parseInt(index1);
		selectionByIndex(location,parseInt);
		
		WebElement hotels = b.getHotels();
		String index2=b.excelRead(password, index1, parseInt2, parseInt3);
		int parseInt4 = Integer.parseInt(index2);
		selectionByIndex(hotels, parseInt4);
		
		WebElement roomtype = b.getRoomtype();
	   String index3=b.excelRead(index1, index2, parseInt3, parseInt4);
	     int parseInt5 = Integer.parseInt(index3);
	     selectionByIndex(roomtype, parseInt5);
	     
	     
	     WebElement nooofrooms = b.getNooofrooms();
	     String index4=b.excelRead("C:\\\\Users\\\\lenovo\\\\Desktop\\\\xls", "Sheet1"," 0", "5");
	     
		int parseInt6 = Integer.parseInt(index4);
		selectionByIndex(nooofrooms, parseInt6);
		
		WebElement adultsperroom = b.getAdultsperroom();
		String index5=b.excelRead("C:\\\\Users\\\\lenovo\\\\Desktop\\\\xls", "Sheet1", "0", "6");
		int parseInt7 = Integer.parseInt(index5);
		selectionByIndex(adultsperroom, parseInt7);
		
		WebElement childreen = b.getChildreen();
		String index6=b.excelRead("C:\\\\Users\\\\lenovo\\\\Desktop\\\\xls", "Sheet1", "0", "7");
		int parseInt8 = Integer.parseInt(index6);
		
		selectionByIndex(childreen, parseInt8);
		
		
		WebElement submit = b.getSubmit();
		b.buttonclick(submit);
		
       Selectpage c=new Selectpage();
       WebElement continuepage = c.getContinuepage();
       c.buttonclick(continuepage);
       
       
       Bookingpage d=new Bookingpage( );
       WebElement fistname = d.getFistname();
       String intex7=c.excelRead("C:\\\\Users\\\\lenovo\\\\Desktop\\\\xls", "Sheet1", "0", "8" );
       Integer.parseInt(password);
       selectionByIndex(fistname, parseInt8);
       
       WebElement lastname = d.getLastname();
       String index8=c.excelRead("C:\\\\Users\\\\lenovo\\\\Desktop\\\\xls", "Sheet1", "0" ,"9");
       int parseInt9 = Integer.parseInt(index8);
       selectionByIndex(lastname, parseInt9);
       
       
       WebElement address = d.getAddress();
       String index9=c.excelRead("C:\\\\Users\\\\lenovo\\\\Desktop\\\\xls", "Sheet1", "1", "1");
       int parseInt10 = Integer.parseInt(index9);
       selectionByIndex(address, parseInt10);
       
       WebElement cardNO = d.getCardNO();
       String index10=c.excelRead("C:\\\\Users\\\\lenovo\\\\Desktop\\\\xls", "Sheet1", "1", "2");
       int parseInt11 = Integer.parseInt(index10);
       selectionByIndex(cardNO, parseInt11);
       
       
       WebElement cardType = d.getCardType();
       String index11=c.excelRead("C:\\\\Users\\\\lenovo\\\\Desktop\\\\xls", "Sheet1", "1", "3");
       int parseInt12 = Integer.parseInt(index11);
       selectionByIndex(cardType, parseInt12);
       
       
       
       WebElement monthe = d.getMonthe();
       String index12=d.excelRead("C:\\\\Users\\\\lenovo\\\\Desktop\\\\xls", "Sheet1", "1", "3");
       int parseInt13 = Integer.parseInt(index12);
       selectionByIndex(monthe, parseInt13);
       
       WebElement cvvNumber = d.getCVVNumber();
       String index13=d.excelRead("C:\\\\Users\\\\lenovo\\\\Desktop\\\\xls", "Sheet1", "1",  "4");
       int parseInt14 = Integer.parseInt(index13);
       selectionByIndex(cvvNumber, parseInt14);
       
       
    		   
    		   
       
       
       
       
  
       
	     
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static void selectionByIndex(WebElement fistname, int parseInt8) {
		// TODO Auto-generated method stub
		
	}

	private static void selectionByIndex(WebElement fistname, int parseInt8) {
		// TODO Auto-generated method stub
		
	}

	private static void selectionByIndex(WebElement fistname, int parseInt8) {
		// TODO Auto-generated method stub
		
	}

	private static void TestId(String string) {
		// TODO Auto-generated method stub
		
	}

	
	

	

	

}
