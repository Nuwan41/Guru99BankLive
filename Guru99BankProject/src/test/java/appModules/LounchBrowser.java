package appModules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Constants;

public class LounchBrowser {
public static WebDriver LounchChrome(WebDriver driver){
	System.setProperty("webdriver.chrome.driver", Constants.chromeDriverPath);
		driver = new ChromeDriver();  	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constants.url);
		return driver;
}
}
