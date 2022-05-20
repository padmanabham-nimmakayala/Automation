package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		Select dropdown = new Select(driver.findElement(By.xpath("//select[contains(@id,'day')]")));
		dropdown.selectByIndex(1);
		Thread.sleep(3000);
		// dropdown.selectByValue("14");
		// dropdown.selectByVisibleText("4");
		List<WebElement> list = dropdown.getOptions();
		int size = list.size();
		System.out.println("size is" + size);
		for (int i = 0; i < size; i++) {
			String date = list.get(i).getText();
			System.out.println(date);

		}

	}

}
