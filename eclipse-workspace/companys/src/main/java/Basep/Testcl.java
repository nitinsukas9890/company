package Basep;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcl {
	public static WebDriver driver;
	public static void launchbrowser() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nitin\\eclipse-workspace\\SeleniumProject\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		
	}

}
