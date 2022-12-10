package capsss;

public class info extends securitypage{
	
	
	
	
	
	void back()
	{
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		
		driver.getCurrentUrl();
		
		
		
		String lin = driver.getCurrentUrl();
		System.out.println("Title for this Current Url:    " + lin);
		System.out.println();

		
		
		
		
	}
	
	
	
	

}
