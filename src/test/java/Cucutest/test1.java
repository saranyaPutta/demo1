package Cucutest;
import io.cucumber.java.en.*;

public class test1 {
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
	  System.out.println("step1");  
	}

	@When("user given the Username and password")
	public void user_given_the_username_and_password() {
		System.out.println("step2");  
	}

	@And("clicked on login button")
	public void clicked_on_login_button() {
		System.out.println("step3");  
	}

	@Then("navigated to the home page")
	public void navigated_to_the_home_page() {
		System.out.println("step4");  
	}
 
}
