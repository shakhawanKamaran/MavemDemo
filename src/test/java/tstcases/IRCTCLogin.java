package tstcases;

import org.openqa.selenium.WebDriver;

import googleException.Contants;
import googleException.Utility;
import raman.IRCTC;
import raman.TrainList;

public class IRCTCLogin {
	
	// Test case
	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Utility.returnDriver("chrome");
		driver.get(Contants.BaseUrl);
		driver.manage().window().maximize();
		IRCTC login = new IRCTC(driver);
		login.trainSearch("NDLS","CNB","23-12-2019") ;
		Thread.sleep(3000);
		System.out.println("we r here");
	
		System.out.println("clcik performed");
		
		
		
	}
}
