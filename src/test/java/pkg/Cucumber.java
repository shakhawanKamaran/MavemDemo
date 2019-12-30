package pkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cucumber {

	public static void main(String A[])

	{

		System.setProperty("webdriver.chrome.driver",
				"C://Users//srishti.goel//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		List<WebElement> veges = driver.findElements(By.cssSelector("div[class='product']>h4")) ;
		int i=1 ;
		for(WebElement vege : veges)
		{
			if(vege.getText().contains("Cucumber"))
			{
				System.out.println(i);
				By addToCart = By.xpath("(//div[@class='product-action']/button)["+i+"]") ;
				driver.findElement(addToCart).click();
				break;
			}
			else
				i++;
			
		}
		System.out.println(i);
		
	}
}
