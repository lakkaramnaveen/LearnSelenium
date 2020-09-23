package seleniumdemos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumCucumberSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize(); //to max the window size
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click(); //to find the element and get it
		Alert alert = driver.switchTo().alert(); //will switch 
		String alertmessage = driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		Thread.sleep(4000);
		alert.accept();//closes the popup alert
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click(); //to find the element and get it
		Alert alert1 = driver.switchTo().alert(); //will switch 
		String alertmessage1 = driver.switchTo().alert().getText();
		System.out.println(alertmessage1);
		Thread.sleep(3000);
		alert1.dismiss();
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert alert2=driver.switchTo().alert();
		alert2.sendKeys("Nani");
		alert2.accept();
		
		driver.close();
	}
}
