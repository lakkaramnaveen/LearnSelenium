package demoshopPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPageFactory {
	WebDriver driver;
	
	@FindBy(xpath = "//label[contains(text(),'Male')]")
	WebElement gender;
	
	@FindBy(id="FirstName")
	WebElement firstName;
	
	@FindBy(id="LastName")
	WebElement lastName;
	
	@FindBy(id="Email")
	WebElement email; 
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(id="ConfirmPassword")
	WebElement confirmPassword;
	
	@FindBy(xpath="//input[@id='register-button']")
	WebElement register;
	
	public RegisterPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void checkGender() {
		gender.click();
	}
	public void firstName(String firstname) {
		firstName.sendKeys(firstname);
	}
	public void lastName(String lastname) {
		lastName.sendKeys(lastname);
	}
	public void email(String mail) {
		email.sendKeys(mail);
	}
	public void pass(String pass) {
		password.sendKeys(pass);
	}
	public void confirmPass(String pass) {
		confirmPassword.sendKeys(pass);
	}
	public void clickRegister() {
		register.click();
	}
}
