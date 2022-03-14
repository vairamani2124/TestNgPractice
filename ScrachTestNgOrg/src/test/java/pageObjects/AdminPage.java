package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
	
	public AdminPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//b[text()='Admin']")	
 private WebElement Admin;
@FindBy(id="menu_admin_UserManagement")
private WebElement Usermanagement;
@FindBy(xpath="//a[@id='menu_admin_viewSystemUsers']")
private WebElement User;
@FindBy(xpath="//select[@id=\"searchSystemUser_userType\"]")
private WebElement UserRole;
@FindBy(xpath="//select[@id=\"searchSystemUser_status\"]")
private WebElement status;
public WebElement getAdmin() {
	return Admin;
}
public WebElement getUsermanagement() {
	return Usermanagement;
}
public WebElement getUser() {
	return User;
}
public WebElement getUserRole() {
	return UserRole;
}
public WebElement getStatus() {
	return status;
}
public WebElement getSearch() {
	return search;
}
public WebElement getText1() {
	return text1;
}
public WebElement getText2() {
	return text2;
}

@FindBy(xpath="//input[@id=\"searchBtn\"]")
private WebElement search;

@FindBy(xpath="//td[text()='Admin']")
private WebElement text1;
@FindBy(xpath="//td[text()='Enabled']")
private WebElement text2;
}
