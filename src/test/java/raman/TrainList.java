package raman;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class TrainList {
	
	WebDriver driver ;
	public String relativepath = "/nget/train-search";
	public String avbleTrains = "div.train_avl_enq_box.fromAndToStn>div>div>div>div>a" ;
	public String popUp = "div#corover-close-btn";
	public String travelLocation ="BUBNESWR RJDHNI" ;
	public String checkAvalibilityBtn ="button#check-availability" ;
	public String popup = "popUp";
	
	public TrainList(WebDriver driver)
	{
		this.driver = driver ;
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	//	Assert.assertTrue(driver.getCurrentUrl().contains("/booking/train-list"));
		
		
	}
	
	public WebElement popUpBtn(WebDriver driver)
	{
		
		return driver.findElement(By.cssSelector(popUp)) ;
		
	}
	
	public void selectTrain(WebDriver driver,String travelLocation) throws InterruptedException  
	{
		
		System.out.println("select train methos");
		
		int i = 0;
		Thread.sleep(3000);
		popUpBtn(driver).click();
//		driver.findElement(By.xpath("//*[contains(text(),'"+travelLocation+"')]/ancestor::div[contains(@class,'train_avl')]//*[@id='check-availability']")).click();
		List<WebElement> trains = driver.findElements(By.cssSelector(avbleTrains));
		for(WebElement train : trains)
		{
//			i++;
			System.out.println(train.getText());
		
			if(train.getText().contains(travelLocation))
			{
				System.out.println("in if portion");				
				driver.findElements(By.cssSelector(checkAvalibilityBtn)).get(i).click();
				break;
				
				
			}
		}
	}
	
	
}

