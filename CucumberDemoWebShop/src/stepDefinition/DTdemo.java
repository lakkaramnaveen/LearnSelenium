package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class DTdemo {
	
	WebDriver driver;
	
	@Given("^user in on demowebshoptricentis\\.com page$")
	public void user_in_on_demowebshoptricentis_com_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumCucumberSoftware\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login"); //open the website from url
		driver.manage().window().maximize();
	}

	@When("^user signs in with valid email and valid password$")
	public void user_signs_in_with_valid_email_and_valid_password(DataTable credentials) throws Throwable {
		List<List<String>> data = credentials.raw();
		driver.findElement(By.id("Email")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("Password")).sendKeys(data.get(0).get(1));
	}

	@Then("^user should see logout$")
	public void user_should_see_logout() throws Throwable {
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.close();
	}
}
