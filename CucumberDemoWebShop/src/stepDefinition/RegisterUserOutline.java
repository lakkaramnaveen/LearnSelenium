package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
//#|Male	|rahul		|aitha		|rahul1111@gmail.com	|123456	  |123456		  |
public class RegisterUserOutline {
	WebDriver driver;

	@Given("^user is on register page of website$")
	public void user_is_on_register_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumCucumberSoftware\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.get("http://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		String exp_str = "Demo Web Shop. Register";
		String act_str = driver.getTitle();
		assertEquals(exp_str, act_str);
	}

	@When("^user enters valid personal details like ([^\\\"]*) and ([^\\\"]*) and ([^\\\"]*) and ([^\\\"]*)$")
	public void user_enters_valid_personal_details_like_Male_rahul_kumar_rahulanna_gmail_com(String gender,String firstName,String lastName,String email) throws Throwable {
		if(gender.equals("Male")) {
			driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
		}
		else {
			driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		}
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(firstName);
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(lastName);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
	}

	@And("^user gives valid ([^\\\"]*) and ([^\\\"]*)$")
	public void user_enters_valid(String password,String confirmPassword) throws Throwable {
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys(confirmPassword);
	}

	@And("^user click on register button$")
	public void user_clicks_on_register_button() throws Throwable {
		driver.findElement(By.id("register-button")).click();
	}

	@Then("^user should see a message registration successful$")
	public void user_should_see_a_message_registration_successful_with_continue_button() throws Throwable {
		String exp_str = "Register";
		String str = driver.findElement(By.xpath("//h1[contains(text(),'Register')]")).getText();
		assertEquals(exp_str, str);
		Thread.sleep(2000);
		driver.close();
	}
}
