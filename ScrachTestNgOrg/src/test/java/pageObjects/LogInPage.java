package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	
	public LogInPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//input[@id=\"txtUsername\"]")
	private  WebElement userName;
	
	
	@FindBy(xpath="//input[@id=\"txtPassword\"]")
	private WebElement passWord;
	
	@FindBy(id="btnLogin")
	private WebElement btn;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getBtn() {
		return btn;
	}
	

}
