package automation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationExcel2 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://www.instagram.com/?hl=en");
			driver.manage().window().fullscreen();
			FileInputStream file = new FileInputStream("C:\\Users\\prade\\Desktop\\Padmanabham.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(file);
			XSSFSheet sheet = wb.getSheet("Sheet1");
			int rowcount = sheet.getLastRowNum();
			for (int i = 1; i <= rowcount; i++) {
				XSSFRow row = sheet.getRow(i);
				String username = row.getCell(0).getStringCellValue();
				String password = row.getCell(1).getStringCellValue();
	
				driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
				driver.findElement(By.name("password")).sendKeys(password);
				driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]"))
						.click();
				Thread.sleep(2000);
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				driver.navigate().to("https://www.instagram.com/?hl=en");
				driver.manage().window().maximize();
	
			}
	

}}
