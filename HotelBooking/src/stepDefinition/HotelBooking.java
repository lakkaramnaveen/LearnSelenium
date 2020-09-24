package stepDefinition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HotelBooking {

	WebDriver driver;
	

@Given("^User in on hotel booking form page$")
public void user_in_on_hotel_booking_form_page() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "D:\\SeleniumCucumberSoftware\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("file:///C:/Users/nanin/Desktop/Boot_Camp/files/BDD%20Material/hotelBooking/hotelbooking.html");
	driver.manage().window().maximize();
	String expected_title = "Hotel Booking";
	String actual_title = driver.getTitle();
	System.out.println(actual_title);
	assertEquals(expected_title,actual_title);
}

@When("^User enters personal details$")
public void user_enters_personal_details() throws Throwable {
	driver.findElement(By.id("txtFirstName")).sendKeys("Rahul");
	driver.findElement(By.id("txtLastName")).sendKeys("Anna");
	driver.findElement(By.id("txtEmail")).sendKeys("rahulanna@gmail.com");
	driver.findElement(By.id("txtPhone")).sendKeys("9812312312");
	driver.findElement(By.tagName("textarea")).sendKeys("1-12/3, Rahul Adda, Gajwel");
	WebElement ele = driver.findElement(By.name("city"));	
	Select sel = new Select(ele);
	sel.selectByIndex(4);
	WebElement ele1 = driver.findElement(By.name("state"));	
	Select sel1 = new Select(ele1);
	sel1.selectByIndex(4);
	WebElement ele2 = driver.findElement(By.name("persons"));	
	Select sel2 = new Select(ele2);
	sel2.selectByValue("4");
	String noofrooms = driver.findElement(By.id("rooms")).getText();

}

@And("^User enters payment details$")
public void user_enters_payment_details() throws Throwable {
	driver.findElement(By.id("txtCardholderName")).sendKeys("Rahul");
	driver.findElement(By.id("txtDebit")).sendKeys("12121121121");
	driver.findElement(By.id("txtCvv")).sendKeys("121");
	driver.findElement(By.id("txtMonth")).sendKeys("12");
	driver.findElement(By.id("txtYear")).sendKeys("21");
}
@And("^User clicks on confirm booking$")
public void user_clicks_on_confirm_booking() throws Throwable {
	driver.findElement(By.id("btnPayment")).click();
}

@Then("^User should be able to see Booking Completed$")
public void user_should_be_able_to_see_Booking_Completed() throws Throwable {
	String exp_title = "Payment Details";
	String act_title = driver.getTitle();
	assertEquals(exp_title, act_title);
	String exp_h1 = "Booking Completed!";
	String act_h1 = driver.findElement(By.tagName("h1")).getText();
	assertEquals(exp_h1, act_h1);
	Thread.sleep(2000);
	driver.close();
}


}
