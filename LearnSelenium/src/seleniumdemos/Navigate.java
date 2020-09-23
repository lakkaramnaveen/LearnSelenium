package seleniumdemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumCucumberSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize(); //to max the window size
		String url = "http://demowebshop.tricentis.com/";
//		driver.get(url);
		driver.navigate().to(url);
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().to(url);
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		 List<WebElement> links = driver.findElements(By.tagName("a"));
	     System.out.println(links.size());
	     
	     for(int i=0;i<links.size();i++) {
	    	 System.out.println(links.get(i).getText());
	     }
	     
	     
	     List<WebElement> input = driver.findElements(By.tagName("input"));
	     System.out.println("Number of inputs	"+input.size());
	     
	      
		driver.close();
	}

}
