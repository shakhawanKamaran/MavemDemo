package raman;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import googleException.Utility;

public class IRCTC {

	WebDriver driver ;
	String relativepath = "/nget/train-search";
	//By from = By.cssSelector("span.ui-autocomplete.ui-widget>input") ;
	String From = "//*[@id=\"origin\"]/span/input";
	String To = "//*[@id=\"destination\"]/span/input";
	
	String Date = "span.ng-tns-c14-6.ui-calendar.ui-calendar-w-btn" ;
	String findTrain = "//*[contains(text(),'Find trains')]";
	
	public IRCTC(WebDriver driver)
	{
		this.driver = driver ;
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		Assert.assertTrue(driver.getCurrentUrl().contains("train-search"));
	}
	
	
	public void trainSearch(String to, String from, String date) throws InterruptedException
	{
		Utility.findElement("xp", From).sendKeys(to, Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(1000);
		Utility.findElement("xp",To).sendKeys(from ,Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(1000);
		Utility.findElement("xp", findTrain).click();
//		Utility.findElement("xp", Date).sendKeys(date);
	}
	
}
