package ToolsQA.MavenDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IFrame {

	public static void main(String A[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//srishti.goel//Downloads//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.toolsqa.com/iframe-practice-page/");
//		int size = driver.findElements(By.tagName("iframe")).size();
//		System.out.println(size);
//		//driver.close();
//		Thread.sleep(2000);

		driver.get("http://qaclickacademy.com/practice.php");
		WebElement textBox = driver.findElement(By.id("autocomplete"));
		textBox.sendKeys("Ind");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = "return document.getElementById('autocomplete').value";
		
		String text = (String) js.executeScript(script);
		System.out.println(text);
		while (!text.equalsIgnoreCase("India")) {

			textBox.sendKeys(Keys.ARROW_DOWN);
			
			text = (String) js.executeScript(script);
			System.out.println(text);
		}
		
		//textBox.sendKeys(Keys.ENTER);
		System.out.println(text);
		Actions a = new Actions(driver);
		
		
		a.doubleClick(textBox).build().perform();;
		//a.clickAndHold(textBox).build().perform() ;
//		
//		a.moveToElement(driver.findElement(By.id("name"))).build().perform();
//		a.release(driver.findElement(By.id("name"))).build().perform();;
		System.out.println("we are here ");
	a.dragAndDrop(textBox, driver.findElement(By.id("name"))).build().perform();	
		
		
		
		

	}
}
