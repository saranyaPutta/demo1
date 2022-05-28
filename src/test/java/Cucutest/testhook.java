package Cucutest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class testhook {
	@Before
	public void testing() {
		System.out.println("Before class");
	}
	
	@After
	public void teardown() {
		System.out.println("Afterclass");
	}
	
	@Given("user is on Beta login test")
	public void user_is_on_beta_login_test() {
		System.out.println("step-1");
	}

	@And("navigated to home page")
	public void navigated_to_home_page() {
		System.out.println("step-2");
	}

}
