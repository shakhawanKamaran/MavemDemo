package ToolsQA.MavenDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tooltip {

	public static void main(String A[])
	{
		System.setProperty("webdriver.chrome.driver",
				"C://Users//srishti.goel//Downloads//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demoqa.com/tooltip/");
		
		
		String text = driver.findElement(By.id("age")).getAttribute("title");
		
		
		System.out.println(text);
			
		Actions a =  new Actions(driver);
		
		a.moveToElement(driver.findElement(By.id("age"))).build().perform();
		
		WebElement getText = driver.findElement(By.id("age"));
		
		
		System.out.println("text is " +getText.getText());
		
		
	}
}
