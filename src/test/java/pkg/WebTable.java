package pkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver",
				"C://Users//srishti.goel//Downloads//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.toolsqa.com/automation-practice-table/");
		
		List<WebElement> headers=driver.findElements(By.xpath("//table/thead/tr/th"));
		
		List<WebElement> rows=driver.findElements(By.xpath("//table/tbody/tr"));
		
		System.out.println(headers.size());
		System.out.println(rows.size());
		
		//int countryheadercount=0;
		
		for (int i=0;i<headers.size();i++)
		{
			if(headers.get(i).getText().equals("Country"))
			{
				for (int j=1;j<rows.size();j++)
				{
					System.out.println(i +"and" +j);
					
					String CountryName=driver.findElement(By.xpath("//table/tbody/tr[" +j+"]/td[" +i+"]")).getText();
					
					System.out.println(CountryName);
					
					if (CountryName.equalsIgnoreCase("UAE"))
					{
						
						for (int k=0;i<headers.size();k++)
						{
							if(headers.get(k).getText().equals("Height"))
							{
								String height=driver.findElement(By.xpath("//table/tbody/tr[" +j+"]/td[" +k+"]")).getText();
								
								System.out.println(height);
								
								break;
							}
						}
						break;
					}
						
				}
			}
		}
	}

	
	
}
