package ToolsQA.MavenDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String A[]) {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//srishti.goel//Downloads//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/web-table-element.php");
		System.out.println(driver.getTitle());

		WebElement table = driver.findElement(By.className("dataTable"));

		int rowsCount = table.findElements(By.cssSelector("tbody>tr")).size();

		int columnsCount = table.findElements(By.cssSelector("thead>tr>th")).size();

		System.out.println(rowsCount);
		System.out.println(columnsCount);

		List<WebElement> rows = table.findElements(By.cssSelector("table[class='dataTable']>tbody>tr>td"));

		List<WebElement> counts = table.findElements(By.cssSelector("thead>tr>th"));
		for (int i = 0; i < rowsCount; i++) {

			if (table.findElements(By.cssSelector("table[class='dataTable']>tbody>tr>td>a")).get(i).getText()
					.contains("ICICI Pru Life")) {
				// System.out.println(table.findElements(By.cssSelector("tbody>tr")).get(i).findElements(By.cssSelector("td")).get(2).getText())
				// ;
				System.out.println("we r here");
				for (WebElement row : rows) {
					if (row.getText().equalsIgnoreCase("A")) {
						for (int j = 0; j < columnsCount; j++) {
							if (table.findElements(By.cssSelector("thead>tr>th")).get(j).getText()
									.contains("Prev Close")) {
								System.out.println(table.findElements(By.cssSelector("tbody>tr")).get(i)
										.findElements(By.cssSelector("td")).get(j).getText());
								System.out.println("here");
								
							}
							
						}
						break;
					}
				}
			}
		}

	}
}
