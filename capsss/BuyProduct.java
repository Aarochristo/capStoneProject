package capsss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class BuyProduct extends compareTwoProduct{
	
	
	
	@Test(priority = 5)
	void BuyProduc()
	{
		
		
		WebElement firstPro=driver.findElement(By.xpath("(//button[@type='button'])[1]"));
		
		
	WebElement secpro=driver.findElement(By.xpath("(//button[@type='button'])[2]"));
	
	
	Actions ac=new Actions(driver);
	
	
	if(firstPro.isEnabled())
			{
		
		ac.click(firstPro).perform();
		
			}
		else 
		
		{
			ac.click(secpro).perform();
			
			
		}
	
	
	
	

	}
	
	
	
	
}
