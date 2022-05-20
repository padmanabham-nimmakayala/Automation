package globalstructure;

import org.openqa.selenium.By;

public class LoginPage extends BrowserHandler {
	public static By username=By.xpath("//input[@id='email']");
	public static By password=By.xpath("//input[@id='pass']");
	public static By login=By.name("login");

}
