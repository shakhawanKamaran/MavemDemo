package googleException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Google extends Utility{

	By logo = By.cssSelector("img#hplog") ;
	By search = By.name("h");
	Google()
	{
		super();
	}
	public void run() 
	{
		  driver.get(URL);		 
		  
	//	 WebElement we = driver.findElement(logo); 
		 
		  visibilityOfElement(driver, logo);
		  System.out.println("httlosdfk");
		  driver.findElement(By.name("q")).sendKeys("heelo World", Keys.ENTER);
  
		  
	}
}
