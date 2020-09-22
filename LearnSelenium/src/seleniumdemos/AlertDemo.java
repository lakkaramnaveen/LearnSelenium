package seleniumdemos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\SeleniumCucumberSoftware\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize(); //to max the window size
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click(); //to find the element and get it
		Alert alert = driver.switchTo().alert(); //will switch 
		String alertmessage = driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		Thread.sleep(4000);
		alert.accept();//closes the popup alert
		
		driver.close();
	}
}
