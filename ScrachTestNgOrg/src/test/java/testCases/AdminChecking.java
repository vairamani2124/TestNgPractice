package testCases;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonClases.BaseClass;
import pageObjects.AdminPage;

public class AdminChecking extends BaseClass{
	
	AdminPage ap;
	
	@Test
	public void adminCheckTestCase() {
		
		
		logIn(properties.getProperty("username"), properties.getProperty("password"),properties.getProperty("url"));
		
		
		
		 ap= new  AdminPage(driver);
		adminVerify();
		
		String text = ap.getText1().getText();
		String text2 = ap.getText2().getText();
		
		Assert.assertEquals(text, "Admin");
		Assert.assertEquals(text2, "Enabled");
		
		
		
		
		
		
		
		
	}

	private void adminVerify() {
		// TODO Auto-generated method stub
		
		
		
		Actions action=new Actions(driver);
		
		
		action.moveToElement(ap.getAdmin());
		action.moveToElement(ap.getUsermanagement());
		action.click(ap.getUser()).build().perform();
		
		Select select= new Select(ap.getUserRole());
		select.selectByIndex(1);
		
		Select select1= new Select(ap.getStatus());
		select1.selectByIndex(1);
		
		ap.getSearch().click();
		
		
		
		
		
		
	}

}
