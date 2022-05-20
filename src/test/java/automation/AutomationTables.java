package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationTables {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(
				"https://www.sqlbi.com/articles/create-static-tables-in-dax-using-the-datatable-function/#:~:text=A%20static%20table%20has%20a,and%2For%20of%20DAX%20measures.");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.xpath("/html/body/div[1]/article/div[1]/main/div/table"));
		List<WebElement> rows = table
				.findElements(By.xpath(" /html/body/div[1]/article/div[1]/main/div/table/tbody/tr"));
		int rowcount = rows.size();
		List<WebElement> columns = table
				.findElements(By.xpath(" /html/body/div[1]/article/div[1]/main/div/table/tbody/tr[1]/th"));
		int columncount = columns.size();
		for (int i = 1; i <= 1; i++) {
			for (int j = 1; j <= columncount; j++) {
				System.out.print(table
						.findElement(By.xpath(
								"/html/body/div[1]/article/div[1]/main/div/table/tbody/tr[" + i + "]/th[" + j + "]"))
						.getText() + "  ");
			}
			System.out.println();
		}
		for (int i = 2; i <= rowcount; i++) {
			for (int j = 1; j <= columncount; j++) {
				System.out.print(table
						.findElement(By.xpath(
								"/html/body/div[1]/article/div[1]/main/div/table/tbody/tr[" + i + "]/td[" + j + "]"))
						.getText() + "  ");
			}
			System.out.println();
		}

	}
}
