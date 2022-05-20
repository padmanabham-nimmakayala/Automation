package automation;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationDropdownLoop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"manageHeaderdd\"]/div[1]")).click();
		List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"hmb\"]/div[2]/ul/li"));
		int size = list.size();
		System.out.println(size);
		for (int i = 0; i < size; i++) {
			String menu = list.get(i).getText();
			System.out.println(menu);
       if(menu.equalsIgnoreCase("cancel")) {
    	   list.get(i).click();
    	   break;
       }
		}

	}

			

	
}
