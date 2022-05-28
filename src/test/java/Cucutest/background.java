package Cucutest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class background {

@Given("user checking for background function")
public void user_checking_for_background_function() {
	System.out.println("test1");
}

@And("step1")
public void step1() {
	System.out.println("test2");
}

@When("step2")
public void step2() {
	System.out.println("test3");
}

@And("step3")
public void step3() {
	System.out.println("test4");
}

@When("step4")
public void step4() {
	System.out.println("test5");
}




}
