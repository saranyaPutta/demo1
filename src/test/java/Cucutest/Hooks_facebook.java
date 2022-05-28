package Cucutest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks_facebook {
	WebDriver driver;

	@Before
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@After
	public void aftertest() {
		driver.close();
		driver.quit();
	}

	@Given("user on the facebook homepage")
	public void user_on_the_facebook_homepage() {

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());

	}

	@And("user gave the emailId and Password")
	public void user_gave_the_email_id_and_password() {
		driver.findElement(By.id("email")).sendKeys("jeevikasara");
		driver.findElement(By.id("pass")).sendKeys("pass");
	}

	@When("user clicked on the login")
	public void user_clicked_on_the_login() {
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]"))
				.click();
	}

	@Then("user got navigated to facebook home page")
	public void user_got_navigated_to_facebook_home_page() {
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

}
