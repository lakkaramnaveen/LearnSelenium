package stepDefinition;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksDemo {
	static WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumCucumberSoftware\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("set up drivers");
	}
	
	
	@Given("^User has navigated to login page$")
	public void user_has_navigated_to_login_page() throws Throwable {
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		System.out.println("open application");
	}

	@When("^User provides username and password$")
	public void user_provides_username_and_password() throws Throwable {
		driver.findElement(By.id("Email")).sendKeys("naveen1234@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("123456");
	}

	@Then("^User signs in successfully$")
	public void user_signs_in_successfully() throws Throwable {
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		boolean view = driver.findElement(By.linkText("Log out")).isDisplayed();
		assertTrue(view);
		System.out.println("signed in successfully");
		driver.findElement(By.linkText("Log out")).click();
	}
	
	
	@After
	public void tearDown() {
		driver.close();
		System.out.println("close browser");
	}
}
