package seleniumdemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyName {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumCucumberSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("http://demowebshop.tricentis.com/");
		String title_name = driver.getTitle();
		int len = driver.getTitle().length();
		
		System.out.println(title_name);
		System.out.println(len);
		
		String url = driver.getCurrentUrl();
		
		if(url.equals("http://demowebshop.tricentis.com/")) {
			System.out.println("correct page opened");
		}
		else {
			System.out.println("something went wrong");
		}
		
		String pagesource = driver.getPageSource();
		int page_len = pagesource.length();
		
		
		System.out.println(pagesource);
		System.out.println(page_len);
		driver.close();
	}

}
