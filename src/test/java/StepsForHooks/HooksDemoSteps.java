package StepsForHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksDemoSteps {
	WebDriver driver= null;

	@Before(order=0) // used from cucumber FW, like TestNg FW
	public void browserSetup() {
		System.out.println("I am inside browserSetup");
		WebDriverManager.chromiumdriver().setup();
		driver= new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Before(order=1)
	public void setpu2() {
		System.out.println("I am inside setpu2");
	}

	@After(order=1)
	public void tearDown() {
		System.out.println("I am inside tearDown");
		driver.close();
		driver.quit();
	}
	
	@After(order=2)
	public void tearDown2() {
		System.out.println("I am inside tearDown2");
	}

	@BeforeStep
	public static void beforeSteps() {
		System.out.println("I am inside beforeSteps");
	}
	
	@AfterStep
	public void afterSteps()
	{
		System.out.println("I am inside afterSteps");
	}
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {

	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {

	}

	@Then("clicks on login button")
	public void clicks_on_login_button() {

	}

	@And("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {

	}


}