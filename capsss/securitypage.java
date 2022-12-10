package capsss;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class securitypage extends BuyProduct {

	@Test(priority = 6)
	void securitypag()  {

		WebElement check = driver.findElement(By.linkText("Help Center"));
		check.click();

		System.out.println("clicked");
		
		
		

		WebElement clickmen=driver.findElement(By.xpath("//span[.='Men']"));clickmen.click();
		
		
		
		
		
		
	}
	
	
	@Test(priority = 7)
	void gettingTopwear() throws IOException
	{
		
		
		
		
		List<WebElement>foo=driver.findElements(By.xpath("//a[.='Top wear']//following::a"));
		
		
		
		for(WebElement run:foo)
		{
			System.out.println(run.getText().toUpperCase());
			
		}
		
		
		TakesScreenshot edu = (TakesScreenshot) driver;

		File save = edu.getScreenshotAs(OutputType.FILE);
		File location = new File("D:\\studyPurpose.png");
		FileHandler.copy(save, location);
		driver.close();
			
		

		/*
		 * Set<String> create = driver.getWindowHandles();
		 * 
		 * List<String> changewindow = new ArrayList<String>(create);
		 * 
		 * driver.switchTo().window(changewindow.get(1));
		 * 
		 * WebElement text =
		 * driver.findElement(By.xpath("//h2[@id='payment-options']//following::p[2]"));
		 * 
		 * System.out.println(text.getText());
		 */
	}

}
