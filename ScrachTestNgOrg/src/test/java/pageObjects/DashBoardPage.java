package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	
	public DashBoardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[@href=\"/index.php/leave/viewLeaveRequest/id/70\"]")
	private WebElement text;
	
	@FindBy(xpath="//b [text()='Dashboard']")
	private WebElement dash;
	
	
	public WebElement getText() {
		return text;
	}
	
	public WebElement getDash() {
		return dash;
	}
	
	

}
