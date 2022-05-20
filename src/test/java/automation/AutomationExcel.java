package automation;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationExcel {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/login/");
		driver.manage().window().fullscreen();
		FileInputStream file = new FileInputStream("C:\\Users\\prade\\Desktop\\Padmanabham.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		int rowcount = sheet.getLastRowNum();
		for (int i = 1; i <= rowcount; i++) {
			XSSFRow row = sheet.getRow(i);
			String username = row.getCell(0).getStringCellValue();
			String password = row.getCell(1).getStringCellValue();

			driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys(username);
			driver.findElement(By.id("pass")).sendKeys(password);
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/form/div/div[3]/button"))
					.click();
			Thread.sleep(1000);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver
					.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/form/div/div[1]/div[2]"))
					.getText());
			driver.navigate().to("https://www.facebook.com/login/");
			driver.manage().window().maximize();

		}

	}
}