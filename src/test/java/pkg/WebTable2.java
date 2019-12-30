package pkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//srishti.goel//Downloads//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.toolsqa.com/automation-practice-table/");
		
		List<WebElement> headers=driver.findElements(By.xpath("//table/thead/tr/th"));
		
		List<WebElement> rows=driver.findElements(By.xpath("//table/tbody/tr"));
		
		String max1=driver.findElement(By.xpath("//table/tbody/tr[1]/td[4]")).getText();
		int max=Integer.parseInt(max1);
		
		for(int i=0;i<headers.size();i++)
		{
			if(headers.get(i).getText().equals("Built"))
			{
				for(int j=1;j<=rows.size();j++)
				{
					
					
					String heights=driver.findElement(By.xpath("//table/tbody/tr["+j+"]/td["+i+"]")).getText();
					int hei=Integer.parseInt(heights);
					
					if (max>=hei)
					{
						max=hei;
					}
					
				//System.out.println(heights);
				
		//			throw new 
				}
				System.out.println(max);
				break;
			}
		}
		
		
		
		
	}
	 static void validate(int age) throws Exception{
	     if(age<18)
	      throw new Exception("not valid");
	     else
	      System.out.println("welcome to vote");
	   }

}
