package googleException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Utility {

	static WebDriver driver;
	static String Path = "C://Users//srishti.goel//Downloads//chromedriver_win32//chromedriver.exe";
	WebDriverWait wait;
	public String URL = "https://www.google.com" ;
	
	
	public Utility() {
		System.setProperty("webdriver.chrome.driver", Path);
		driver = new ChromeDriver();
	}
	
    public static WebDriver returnDriver(String drivername) {
    	if(drivername.contains("chrome")) {
    		ChromeOptions options = new ChromeOptions();
    		options.addArguments("--disable-notifications");
    		
    		System.setProperty("webdriver.chrome.driver", Contants.chromepath);
    		driver = new ChromeDriver(options);	
    	} else if(drivername.contains("firefox")) {
    		if(drivername.contains("chrome")) {
//        		System.setProperty("webdriver.chrome.driver", Contants.firepath);
        		driver = new ChromeDriver();	
        	}
    	}
		return driver;	
    } 
    
   public static  WebElement findElement(String locatorType, String locatorValue){
	   WebElement elem = null;
    	if(locatorType.contains("xp")){
    		elem = driver.findElement(By.xpath(locatorValue));
    	} else if(locatorType.contains("css")){
    		elem = driver.findElement(By.cssSelector(locatorValue));
    	}
		return elem; 
    }

	public void waitForElement(WebDriver driver, By by)
		{
			wait = new WebDriverWait(driver,5) ;
			try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			}
			catch(TimeoutException e)
			{
				System.out.println("TimeOut Exception,,, Page not loaded properly");
				//driver.navigate().refresh();
			}
		}

	public boolean visibilityOfElement(WebDriver driver, By w)
				{
					try {
						if(driver.findElement(w).isDisplayed())
							return true  ;
		}					catch(NoSuchElementException e)
					{
						System.out.println("no such element ");
					}
					catch(ElementNotVisibleException e)
					{
						System.out.println("not visible");
					}
					
					return false;
					
					
				}
}
