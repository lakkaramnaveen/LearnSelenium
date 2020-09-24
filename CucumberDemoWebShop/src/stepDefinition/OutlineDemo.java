package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class OutlineDemo {
	WebDriver driver;
	
	@Given("^Application is opened$")
	public void application_is_opened() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumCucumberSoftware\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login"); //open the website from url
		driver.manage().window().maximize();
	}

	@When("^I provide valid ([^\\\"]*) and valid ([^\\\"]*)$")
	public void i_provide_valid_naveen_gmail_com_and_valid(String email, String password) throws Throwable {
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.name("Password")).sendKeys(password);
	}

	@Then("^I should see logout link$")
	public void i_should_see_logout_link() throws Throwable {
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.findElement(By.linkText("Log out")).click();	
		driver.close();
	}
}
