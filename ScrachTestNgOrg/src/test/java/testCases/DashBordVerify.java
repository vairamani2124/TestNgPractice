package testCases;

import org.apache.hc.client5.http.auth.UsernamePasswordCredentials;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonClases.BaseClass;
import pageObjects.DashBoardPage;
import pageObjects.LogInPage;

public class DashBordVerify extends BaseClass {
	
	

public String dashbordText() {
	DashBoardPage db=new DashBoardPage(driver);
	
	db.getDash().click();
	
 String text = db.getText().getText();
 return text;
}

	@Test
	public void dashBordVerifying() {
		
		logIn(properties.getProperty("username"), properties.getProperty("password"),properties.getProperty("url"));
		
		dashbordText();
		
		Assert.assertEquals(dashbordText(), "01. Root Abc 2022-03-10");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
