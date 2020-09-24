package stepDefinition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginHotel {
	WebDriver driver;
	
	@Given("^User in on login page of hotel$")
	public void user_in_on_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumCucumberSoftware\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.get("file:///C:/Users/nanin/Desktop/Boot_Camp/files/BDD%20Material/hotelBooking/login.html");//open url
		driver.manage().window().maximize();
		String expected_title = "Hotel Booking Application";
		String actual_title = driver.findElement(By.tagName("h1")).getText();
		System.out.println(actual_title);
		assertEquals(expected_title,actual_title);
	}

	@When("^User enters valid user name and password of hotel$")
	public void user_enters_valid_username_and_password() throws Throwable {
		driver.findElement(By.xpath("//input[@name=\"userName\"]")).sendKeys("Capgemini");
		driver.findElement(By.name("userPwd")).sendKeys("capg1234");
	}

	@And("^User clicks on login button of hotel$")
	public void user_clicks_on_login_button() throws Throwable {
		driver.findElement(By.className("btn")).click();
	}

	@Then("^User should be able to see Hotel booking form$")
	public void user_should_be_able_to_see_Hotel_booking_form() throws Throwable {
		Alert alert = driver.switchTo().alert(); //will switch 
		String alertmessage = driver.switchTo().alert().getText();
		//Thread.sleep(2000);
		alert.accept();
		System.out.println(alertmessage);
		//driver.navigate().to("file:///C:/Users/nanin/Desktop/Boot_Camp/files/BDD%20Material/hotelBooking/hotelbooking.html");
		driver.close();
	}
}
