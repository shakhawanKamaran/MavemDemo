package tstcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import googleException.Contants;
import googleException.Utility;
import raman.IRCTC;
import raman.TrainList;

public class TrainListTest {

	WebDriver driver ;
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Utility.returnDriver("chrome");
		driver.get(Contants.BaseUrl);
		driver.manage().window().maximize();
		IRCTC login = new IRCTC(driver);
		login.trainSearch("NDLS","CNB","23-12-2019") ;
		Thread.sleep(3000);
		System.out.println("we r here");
		TrainList tl = new TrainList(driver);
		tl.selectTrain(driver ,"BUBNESWR RJDHNI");    
		System.out.println("clcik performed");
		
		
		
		
		
	}
	
	
}
