package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
        driver.manage().window().fullscreen();
        
        driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
       
        Actions action=new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[5]/a/div[2]/div/div"))).perform();
        
        WebDriverWait wait=new WebDriverWait(driver, 10);
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'view-all&cid=34WHNYFH5V2Y')]"))).click();
        
        
	}

	}


