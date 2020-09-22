package seleniumdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumCucumberSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/login"); //open the website from url
//		driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys("naveen1234@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("123456");
//		driver.findElement(By.id("RememberMe")).sendKeys("true");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
		String expected_title = "Demo Web Shop";
		String actual_title = driver.getTitle();
		System.out.println(actual_title);
		if(actual_title.equals(expected_title)) {
			System.out.println("You are on the correct page");
			driver.findElement(By.linkText("Log out")).click();	
			driver.close();
		}
		else {
			System.out.println("You are on the wrong page");
			driver.close();
		}
		
//		driver.findElement(By.linkText("Log out")).click();	
		
//		driver.quit(); //all windows that opened by selenium
	}
}
