package Cucutest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class example_01 {
	WebDriver driver;

	@Given("user at the facebook homepage")
	public void user_at_the_facebook_homepage() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
	}

	@When("^the user given the (.*) and (.*)$")
	public void the_user_given_the_user_id_and_pasword(String name,String pass) {
		driver.findElement(By.id("email")).sendKeys(name);
		driver.findElement(By.id("pass")).sendKeys(pass);

	}

	@And("clicked on the login button")
	public void clicked_on_the_login_button() {
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]"))
				.click();

	}

	@Then("user navigated to the facebook home page")
	public void user_navigated_to_the_facebook_home_page() {
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}
}
