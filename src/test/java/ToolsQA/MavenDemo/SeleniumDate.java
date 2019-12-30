package ToolsQA.MavenDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SeleniumDate {

	WebDriver driver ;
	
	@Test
	public void main() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//srishti.goel//Downloads//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// driver.get("https://www.google.com");
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("div[class='fsw_inputBox dates inactiveWidget ']>label>span")).click();

		List<WebElement> months = driver.findElements(By.cssSelector("div[class='DayPicker-Caption']>div"));

		for (WebElement month : months) {
			if (!month.getText().equalsIgnoreCase("February 2020")) {

				driver.findElement(By.cssSelector("span[class='DayPicker-NavButton DayPicker-NavButton--next']"))
						.click();
				Thread.sleep(3000);
				System.out.println(month.getText());
				months = driver.findElements(By.cssSelector("div[class='DayPicker-Caption']>div"));
				System.out.println(month.getText());

			} else {
				System.out.println("month of else part " + month.getText());
				driver.findElement(By.cssSelector("span[class='DayPicker-NavButton DayPicker-NavButton--next']"))
						.click();
				List<WebElement> dates = driver.findElements(By.cssSelector("div[class='DayPicker-Day']>div>p"));

				for (WebElement date : dates) {
					if (date.getText().equalsIgnoreCase("20")) {
						date.click();
						break;
					}
				}

			}

		}
	}
		@AfterTest
		public void flushh()
		{
			
			driver.quit();
			driver = null ;
		}
	
}
