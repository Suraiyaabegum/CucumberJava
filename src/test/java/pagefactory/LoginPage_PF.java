package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
	
	WebDriver driver;
	
	public LoginPage_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
		
	@FindBy(id="CustomerEmail")
	WebElement txt_username;
	
	@FindBy(id="CustomerPassword")
	WebElement txt_password;
	
	@FindBy(xpath="//input[@value='Sign In']")
	WebElement txt_login;
	
	public void enterUsername(String username) {
		txt_username.sendKeys(username);		
	}	
	public void enterPassword(String password) {
		txt_password.sendKeys(password);		
	}	
	public void clickOnLogin() {
		txt_login.click();		
	}
	//logout method is not created coz each page has different class as per PF 
}