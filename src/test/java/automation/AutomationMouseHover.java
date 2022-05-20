package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationMouseHover{

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
        Thread.sleep(3000);
        Actions action=new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[5]/a/div[2]/div/div"))).perform();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(@href,'view-all&cid=34WHNYFH5V2Y')]")).click();
	}

}
