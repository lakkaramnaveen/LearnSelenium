package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;

public class RegisterUser {
	WebDriver driver;
	
	@Given("^user is on register page$")
	public void user_is_on_register_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumCucumberSoftware\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.get("http://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		String exp_str = "Demo Web Shop. Register";
		String act_str = driver.getTitle();
		assertEquals(exp_str, act_str);
	}

	@When("^user enters valid personal details$")
	public void user_enters_valid_personal_details() throws Throwable {
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Rahul");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Anna");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("rahulanna4@gmail.com");
	}

	@When("^user enters valid password$")
	public void user_enters_valid_password() throws Throwable {
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("123456");
	}

	@And("^user clicks on register button$")
	public void user_clicks_on_rgister_button() throws Throwable {
		driver.findElement(By.id("register-button")).click();
	}

	@Then("^user should see a message registration successful with continue button$")
	public void i_should_see_registration_succesful_with_continue_button() throws Throwable {
		String exp_str = "Register";
		String str = driver.findElement(By.xpath("//h1[contains(text(),'Register')]")).getText();
		assertEquals(exp_str, str);
		Thread.sleep(2000);
		driver.close();
	}
}
