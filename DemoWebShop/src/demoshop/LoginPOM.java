package demoshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPOM {
	
	WebDriver driver;
	
	By email = By.id("Email");
	By password = By.name("Password");
	By login = By.xpath("//input[@class='button-1 login-button']");
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enteremail(String em) {
		driver.findElement(email).sendKeys(em);
	}
	public void enterpassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	public void login() {
		driver.findElement(login).click();
	}
}
