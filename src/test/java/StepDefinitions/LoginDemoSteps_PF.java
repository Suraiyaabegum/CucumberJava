package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pagefactory.HomePage_PF;
import pagefactory.LoginPage_PF;

public class LoginDemoSteps_PF {
	WebDriver driver=null;
	LoginPage_PF loginPage_PF;
	HomePage_PF homePage_PF;
	
	@Given("brower is open")
	public void brower_is_open() {
		System.out.println("====Iam inside LoginDemoSteps_PF====");
		System.out.println("browser is open");
		WebDriverManager.chromedriver().setup();  
		driver= new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();   

	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Inside Step-user is on user google search page");
		driver.navigate().to("https://beminimalist.co/account/login");
	}

	@When("^user enter (.*) and (.*)$")   //(.*)Regular expression
	public void user_enter_username_and_password(String username, String password) throws InterruptedException {
		System.out.println("Inside Step-user enters a text in search box");
		loginPage_PF=new LoginPage_PF(driver);
		loginPage_PF.enterUsername(username);
		loginPage_PF.enterPassword(password);
		//driver.findElement(By.id("CustomerEmail")).sendKeys(username);
		//driver.findElement(By.id("CustomerPassword")).sendKeys(password);
		Thread.sleep(2000);
	}


	@And("user clicks on login")
	public void user_clicks_on_login() {
		System.out.println("Inside Step-user clicks on login");
		loginPage_PF.clickOnLogin();
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		System.out.println("Inside Step-user is navigated to home page");
		homePage_PF=new HomePage_PF(driver);
		homePage_PF.checkLogoutIsDisplayed();
		//driver.findElement(By.linkText("Log out")).isDisplayed();
		driver.close();
		driver.quit();
	}  
}