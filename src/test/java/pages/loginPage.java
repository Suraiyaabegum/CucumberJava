package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
		
	protected WebDriver driver;
	public loginPage(WebDriver driver) {
		this.driver=driver;
		if(!driver.getTitle().equals("Account – Minimalist")) {
			throw new IllegalStateException("This is not login page The current page is: " +driver.getCurrentUrl());		
		}
	}
	
	private By txt_username =By.id("CustomerEmail");			
	private By txt_password =By.id("CustomerPassword");	
	private By txt_login =By.xpath("\"//input[@value='Sign In']\"");
	private By btn_logout=By.linkText("Log out");
	
	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);		
	}	
	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);		
	}	
	public void clickLogin() {
		driver.findElement(txt_login).click();		
	}
	public void checkLogoutIsDisplayed() {
		driver.findElement(btn_logout).isDisplayed();	
	}
	
	public void loginValidUser(String username,String password) {
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(txt_login).click();		
	}	
}