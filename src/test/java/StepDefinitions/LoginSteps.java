package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("user is on login page")
	public void user_id_on_login_page() {
		System.out.println("Inside Step-user is on Login Page");
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		System.out.println("Inside Step-user enter username and password");

	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("Inside Step-clicks on login button");
	}

	@Then("user is Navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("Inside Step-user is Navigated to the home page");
	} 

}