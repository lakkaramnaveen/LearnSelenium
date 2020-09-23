package seleniumTestPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import demoshopPageFactory.LoginPageFactory;

public class VerifyLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumCucumberSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
		LoginPageFactory pagefactory = PageFactory.initElements(driver, LoginPageFactory.class);
		
		pagefactory.inputEmail("naveen1234@gmail.com");
		pagefactory.inputPass("123456");
		pagefactory.clickLogin();
		
		Thread.sleep(2000);
		driver.close();
	}
}
