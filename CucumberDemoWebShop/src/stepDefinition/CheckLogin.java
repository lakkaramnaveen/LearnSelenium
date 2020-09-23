package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckLogin {
	WebDriver driver;
	
	@Given("^User in on login page$")
	public void user_in_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumCucumberSoftware\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login"); //open the website from url
		driver.manage().window().maximize();
	}
	@When("^User enters valid username and password$")
	public void user_enters_valid_username_and_password() throws Throwable {
		driver.findElement(By.id("Email")).sendKeys("naveen1234@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("123456");
	}

	@And("^User clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}

	@Then("^User should be able to see Logout button\\.$")
	public void user_should_be_able_to_see_Logout_button() throws Throwable {
		driver.findElement(By.linkText("Log out")).click();	
		driver.close();
	}

}
