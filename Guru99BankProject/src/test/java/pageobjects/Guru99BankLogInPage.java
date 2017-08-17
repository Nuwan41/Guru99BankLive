package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Guru99BankLogInPage {
	static WebElement element;
	
	
	public static WebElement txtUserName(WebDriver driver){
		element= driver.findElement(By.xpath("//*[@name='uid']"));
		return element;
	}
	public static WebElement txtPassword(WebDriver driver){
		element= driver.findElement(By.xpath("//*[@name='password']"));
		return element;
	}
	public static WebElement btnLogin(WebDriver driver){
		element= driver.findElement(By.name("btnLogin"));
		return element;
	}
	
}
