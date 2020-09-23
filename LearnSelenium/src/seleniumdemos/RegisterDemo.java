package seleniumdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumCucumberSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		String url = "http://demowebshop.tricentis.com/register";
		driver.get(url);
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Rahul");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Anna");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("rahulanna@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("123456");
		
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(2000);
		
		driver.navigate().to("http://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("rahulanna@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
