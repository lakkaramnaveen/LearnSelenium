package demoshopPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
	WebDriver driver;
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(name="Password")
	WebElement password;
	
	@FindBy(xpath="//input[@class='button-1 login-button']")
	WebElement login;
	
	public LoginPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void inputEmail(String mail) {
		email.sendKeys(mail);
	}
	public void inputPass(String pass) {
		password.sendKeys(pass);
	}
	public void clickLogin() {
		login.click();
	}
}
