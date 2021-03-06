package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationDynamicTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/test/web-table-element.php#");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table"));
		List<WebElement> rows = table.findElements(By.xpath(" //*[@id=\"leftcontainer\"]/table/tbody/tr"));
		int rowcount = rows.size();
		List<WebElement> columns = table.findElements(By.xpath(" //*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		int columncount = columns.size();
		System.out.println(rowcount);
		System.out.println(columncount);
		for (int i = 0; i < rowcount; i++) {
			for (int j = 0; j < columncount; j++) {
				String text = columns.get(j).getText();
				if (text.equalsIgnoreCase("Central Bank")) {
					System.out.println("prev close is  " + columns.get(2).getText());

				}
			}
		}
	}
}
