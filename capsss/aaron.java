package capsss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class aaron {
	
	
	
	WebDriver driver;
	
	@Test(priority = 0)
	
	
	void start()
	{
		
	
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\chromedriver.exe");

		 driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.navigate().to("https://www.flipkart.com/");
		
		
	}
}
