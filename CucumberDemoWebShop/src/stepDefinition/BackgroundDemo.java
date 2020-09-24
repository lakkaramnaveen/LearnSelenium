package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BackgroundDemo {
	WebDriver driver;
	
	@Given("^I am on the homepage of demoweb$")
	public void i_am_on_the_homepage_of_demoweb() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumCucumberSoftware\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
	}

	@Then("^I should see that title contains demowebshop$")
	public void i_should_see_that_title_contains_demowebshop() throws Throwable {
		assert driver.getTitle().contains("Demo Web Shop");
		driver.close();
	}

	@Then("^I should see that source contains demowebshop$")
	public void i_should_see_that_source_contains_demowebshop() throws Throwable {
		assert driver.getPageSource().contains("Demo Web Shop");
		driver.close();
	}
}
