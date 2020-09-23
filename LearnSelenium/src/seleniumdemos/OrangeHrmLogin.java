package seleniumdemos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHrmLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumCucumberSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://opensource-demo.orangehrmlive.com/");//open url
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String expected_title = "OrangeHRM";
		String actual_title = driver.getTitle();//getting title of webpage

		if(actual_title.equals(expected_title)) {
			System.out.println(actual_title);
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");//enter username
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");//enter password
			driver.findElement(By.id("btnLogin")).click();//click login button
			driver.findElement(By.id("welcome")).click();//click welcome dropdown
			
			//WebDriverWait wait = new WebDriverWait(driver, 10);//explicit wait 
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Logout')]")));
			//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Logout')]")));

			driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).isEnabled();
			driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();	
			Thread.sleep(3000);
			driver.close();
		}
		else {
			System.out.println("You are on the wrong page");
			driver.close();
		}
		

	}
}
