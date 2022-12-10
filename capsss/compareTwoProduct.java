package capsss;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class compareTwoProduct extends class2 {

	@Test(priority = 4)
	void addsecondProuct() {
		WebElement select = driver.findElement(By.xpath("(//div[.='Choose Brand'])[1]"));
		select.click();

		WebElement choosehonor = driver.findElement(By.xpath("//div[.='Honor']"));
		choosehonor.click();

		WebElement chooseproduct = driver.findElement(By.xpath("//div[@class='_1EDlbo _17qiPn']"));
		
		
		System.out.println("comparing the product details and selecting one product from that");

		
		  Actions act=new Actions(driver);
		  
		  
		  act.doubleClick(chooseproduct).perform();
		 

		JavascriptExecutor js = ((JavascriptExecutor) driver);

		js.executeScript("window.scrollBy(0,350)", "");

		
	}

}
