package ToolsQA.MavenDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Exceptn {

	static By search = By.cssSelector("input[name='h']");

	public static void main(String A[]) {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//srishti.goel//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		// WebElement search = driver.findElement(By.id("q"));
		waitForElement(driver, search);

		driver.findElement(search).sendKeys("hello world");

	}

	public static void waitForElement(WebDriver driver, By w) {

		try {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, 2);
		//	wait.until(ExpectedConditions.visibilityOfElementLocated(w));
			//wait.until(ExceptedConditions.)
		}
		catch (TimeoutException e) {
			System.out.println("Timeout exception");
		} 
		catch (NoSuchElementException e) {
			System.out.println("No such element exception");
		} catch (ElementNotVisibleException e) {

		} catch (StaleElementReferenceException e) {

		}
	}

}
