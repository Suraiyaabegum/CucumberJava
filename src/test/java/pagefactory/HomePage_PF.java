package pagefactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomePage_PF {
	WebDriver driver;

	public HomePage_PF(WebDriver driver) {
		this.driver=driver;
		AjaxElementLocatorFactory factory= new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(factory,this);
	}

	@FindBy(linkText="Log out")
	@CacheLookup
	WebElement btn_logout;
	
	@FindBy(partialLinkText="Log out")
	List<WebElement> links;
	
	@FindBy(how=How.ID, using="abc")  //one more way
	WebElement txt_abc;

	public void checkLogoutIsDisplayed() {
		btn_logout.isDisplayed();	
	}

}
