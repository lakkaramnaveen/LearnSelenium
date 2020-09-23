package seleniumTestPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import demoshopPageFactory.RegisterPageFactory;

public class VerifyRegister {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumCucumberSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("http://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		
		RegisterPageFactory pagefactory = PageFactory.initElements(driver, RegisterPageFactory.class);
		
		pagefactory.checkGender();
		pagefactory.firstName("nani");
		pagefactory.lastName("kumar");
		pagefactory.email("naveen12@gmail.com");
		pagefactory.pass("123456");
		pagefactory.confirmPass("123456");
		pagefactory.clickRegister();
		
		Thread.sleep(2000);
		
	}
}
