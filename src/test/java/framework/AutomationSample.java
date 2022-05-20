package framework;

import java.io.FileInputStream;

import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationSample {

	public static void main(String[] args) throws Exception {

		InputStream file = new FileInputStream(
				"C:\\Users\\prade\\eclipse-workspace\\MavenProject\\src\\test\\resources\\config.properties");
		Properties prop = new Properties();
		prop.load(file);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(prop.getProperty("url"));
		System.out.println("url is  " + prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(prop.getProperty("username"));
		System.out.println("username is  " + prop.getProperty("username"));
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(prop.getProperty("password"));
		System.out.println("password is  " + prop.getProperty("password"));
		driver.findElement(By.name("login")).click();

	}

}
