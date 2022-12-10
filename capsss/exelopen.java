package capsss;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class exelopen {
	
	
	
	WebDriver driver;
	
	
	String[][] data=null;
	
	
	@DataProvider(name="fliplogin")
	public String[][]loginflip() throws BiffException, IOException
	{
		data=getExelData();
		
		return data;
	}
	

	String[][] getExelData() throws BiffException, IOException {
		
		
		FileInputStream exel = new FileInputStream("C:\\Users\\aaron\\Downloads\\Book1.xls");

		Workbook workbook = Workbook.getWorkbook(exel);

		Sheet sheet = workbook.getSheet(0);

		// take the count for both row and colums

		int rowcount = sheet.getRows();

		int columcount = sheet.getColumns();
		
		
		System.out.println(rowcount +"colum"+columcount );

		// create 2dimentional array for arrange the value

		String testdata[][] = new String[rowcount - 1][columcount];

		for (int i = 1; i < rowcount; i++) {

			for (int j = 0; j < columcount; j++) {

				testdata[i - 1][j] = sheet.getCell(j, i).getContents();

			}
		}

		return testdata;

	}
	
	@Test(dataProvider="fliplogin")
	
	
	
	public void fliploginscenario(String name,String surname)
	{
		
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\chromedriver.exe");

		 driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.navigate().to("https://www.flipkart.com/");
		
		
		WebElement logi=driver.findElement(By.linkText("Login"));logi.click();
		
		WebElement log=driver.findElement(By.xpath("(//input[@Type='text'])[2]"));log.sendKeys(name);
		
		
		System.out.println(name);
		
		
		
		
		WebElement lo=driver.findElement(By.xpath("//input[@type='password']"));lo.sendKeys(surname);
		
		System.out.println(surname);
		
		/*
		 * WebElement wee = driver.findElement(By.xpath("//button[.='✕']"));
		 * wee.click();
		 * 
		 * WebElement l=driver.findElement(By.linkText("Login"));logi.click();
		 */
	}
	
	@AfterMethod
	void close()
	{
		
		driver.quit();
	}
	
	
}
