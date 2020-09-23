package stepDefinition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InvalidLogin {
	WebDriver driver;

	@Given("^User has opened login page$")
	public void user_has_opened_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumCucumberSoftware\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login"); //open the website from url
		driver.manage().window().maximize();
		String expected_title = "Demo Web Shop. Login";
		String actual_title = driver.getTitle();
		System.out.println(actual_title);
		assertEquals(expected_title,actual_title);
	}

	@When("^User enters valid username and invalid password$")
	public void user_enters_valid_username_and_invalid_password() throws Throwable {
		driver.findElement(By.id("Email")).sendKeys("naveen1234@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("1234");
	}

	@And("^User clicked on login button$")
	public void user_clicked_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}

	@Then("^User should be able to see \"([^\"]*)\"$")
	public void user_should_be_able_to_see(String arg1) throws Throwable {
		boolean view = driver.findElement(By.xpath("//span[contains(text(),'Login was unsuccessful. Please correct the errors')]")).isDisplayed();
		assertTrue(view);
		driver.findElement(By.xpath("//span[contains(text(),'Login was unsuccessful. Please correct the errors')]"));
		driver.close();
	}
}
