package capsss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class class2 extends aaron {

	@Test(priority = 1)
	void closeloginPgae() {
		
		String lo = driver.getWindowHandle();


		WebElement wee = driver.findElement(By.xpath("//button[.='✕']"));
		wee.click();
	}

	@Test(priority = 2)
	void searchProduct() {
		
		
		Actions action =new Actions(driver);
		
		

		WebElement joint = driver.findElement(By.xpath("//input[@type='text']"));
		joint.sendKeys("delllap",Keys.ENTER);
		
		

	}
	
	@Test(priority = 3)
	void compare()
	{
		WebElement acacho = driver.findElement(By.xpath("(//span[contains(.,'Add to Compare')])[1]"));acacho.click();
		
		WebElement comp=driver.findElement(By.xpath("(//span[.='COMPARE'])[2]"));comp.click();
		
	}

}
