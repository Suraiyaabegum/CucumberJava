package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchSteps {
	
	WebDriver driver=null;
	
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("browser is open");
		WebDriverManager.chromedriver().setup();  
		driver= new ChromeDriver(); //user enters a text in search box
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();   
	}

	@And("user is on user google search page")
	public void user_is_on_user_google_search_page() {
		System.out.println("Inside Step-user is on user google search page");
		driver.navigate().to("https://www.google.com/");
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() throws InterruptedException {
		System.out.println("Inside Step-user enters a text in search box");
		driver.findElement(By.name("q")).sendKeys("Automatoion Step by Step");
		Thread.sleep(2000);
	}

	@And("hits enter")
	public void hits_enter() {
		System.out.println("Inside Step-hits enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("Inside Step-user is navigated to search results");
		
		driver.getPageSource().contains("Online Courses");
		driver.close();
		driver.quit();
	}

}
