package frameworkcomplete;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import globalstructure.BrowserHandler;
import globalstructure.LoginPage;


public class Framework extends BrowserHandler {

	public static void main(String[] args) throws Exception {
		InputStream file = new FileInputStream(
				"C:\\Users\\prade\\eclipse-workspace\\MavenProject\\src\\test\\resources\\config.properties");
		Properties prop = new Properties();
		prop.load(file);
		
		Framework frame = new Framework();
		frame.browser("chrome");

		driver.navigate().to(prop.getProperty("url"));
		System.out.println("url is  " + prop.getProperty("url"));

		driver.findElement(LoginPage.username).sendKeys(prop.getProperty("username"));
		System.out.println("username is  " + prop.getProperty("username"));
		
		driver.findElement(LoginPage.password).sendKeys(prop.getProperty("password"));
		System.out.println("password is  " + prop.getProperty("password"));
		
		driver.findElement(LoginPage.login).click();

	}

}
