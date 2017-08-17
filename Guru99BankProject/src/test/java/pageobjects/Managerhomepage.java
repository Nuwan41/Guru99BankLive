package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Managerhomepage {
	private static WebElement element;
	public static WebElement TtlWelcomeManagerPage(WebDriver driver){
		//element=driver.findElement(By.cssSelector("marquee[class='heading3']"));
		element=driver.findElement(By.xpath("//*[@class='heading3']"));
		return element;
	}

}
