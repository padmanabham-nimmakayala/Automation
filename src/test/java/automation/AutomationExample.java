package automation;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationExample {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
        driver.manage().window().fullscreen();
        driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
        driver.findElement(By.xpath("//input[contains(@name,'q')]")).sendKeys("samsung");
        driver.findElement(By.className("L0Z3Pu")).click();
        Thread.sleep(5000);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[3]/div[1]/div[1]")).getText());
       
}
}