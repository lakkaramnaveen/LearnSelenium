package seleniumdemos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotelLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumCucumberSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("file:///C:/Users/nanin/Desktop/Boot_Camp/files/BDD%20Material/hotelBooking/login.html");//open url

		driver.findElement(By.name("userName")).sendKeys("Capgemini");
		driver.findElement(By.name("userPwd")).sendKeys("capg1234");
		driver.findElement(By.className("btn")).click();
		//it wont work because we haven't got correct credentials
		Alert alert = driver.switchTo().alert(); //will switch 
		String alertmessage = driver.switchTo().alert().getText();
		//Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		System.out.println(alertmessage);
		driver.navigate().to("file:///C:/Users/nanin/Desktop/Boot_Camp/files/BDD%20Material/hotelBooking/hotelbooking.html");
//		Thread.sleep(2000);
		
		
		//driver.close();
		
	}
}
