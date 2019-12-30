package googleException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle {

	public static void main(String A[]) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//srishti.goel//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String path = "C:\\Users\\srishti.goel\\eclipse-workspace\\MavenDemo\\src\\test\\java\\googleException\\Data1.txt" ;
		File f = new File(path ) ;
		//FileOutputStream fis = new FileOutputStream(f) ;
		FileWriter fw = new FileWriter(f) ;
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("udemy", Keys.ENTER);
		List<WebElement> links = driver.findElements(By.cssSelector("p.nVcaUb>a"));
		for (WebElement link : links) {
			link.sendKeys(Keys.LEFT_CONTROL, Keys.ENTER);
		}
		Set<String> ids = driver.getWindowHandles();
		List<String> text = new ArrayList<String>();
		Iterator it = ids.iterator();
		String txt;
	
		while (it.hasNext()) {
			driver.switchTo().window((String) it.next());
			Thread.sleep(3000);
			txt = driver.findElement(By.cssSelector("input.gLFyf.gsfi")).getAttribute("value");
			System.out.println("search box text is " +txt);
			text.add(txt);
			
			fw.write(txt);
			fw.write(" \n ");
			
			//driver.navigate().back();
		}
		System.out.println(text);
		fw.close();
		driver.quit();
	}
}
