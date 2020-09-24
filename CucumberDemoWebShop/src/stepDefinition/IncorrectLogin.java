package stepDefinition;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class IncorrectLogin {
	
	WebDriver driver = HooksDemo.driver;
	
	@Given("^Application demowebshop is opened$")
	public void application_demowebshop_is_opened() throws Throwable {
		driver.get("http://demowebshop.tricentis.com/login"); //open the website from url
		driver.manage().window().maximize();
		System.out.println("open application");
	}

	@When("^I provide valid username and invalid password$")
	public void i_provide_valid_username_and_invalid_password() throws Throwable {
		driver.findElement(By.id("Email")).sendKeys("naveen1234@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("1234");
	}

	@Then("^I should view an error message$")
	public void i_should_view_an_error_message() throws Throwable {
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		boolean view = driver.findElement(By.xpath("//span[contains(text(),'Login was unsuccessful. Please correct the errors')]")).isDisplayed();
		assertTrue(view);
	}


}
