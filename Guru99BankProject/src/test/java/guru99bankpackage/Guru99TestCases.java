package guru99bankpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import pageobjects.Guru99BankLogInPage;
import utility.Constants;


public class Guru99TestCases {
	WebDriver driver;
  @Test
  public void f() {
	  
	  System.out.println("Hello Nuwan. Welcome to Guru99Bank");
  }
  @Test
  public void TestCase1() {
	  	System.setProperty("webdriver.gecko.driver", Constants.geckoDriverPath);
		  driver=new FirefoxDriver();
		  
	  /*
		  System.setProperty("webdriver.chrome.driver", Constants.chromeDriverPath);
		  driver=new ChromeDriver();
		  */
	  
		  driver.get(Constants.url);
		 
		  Guru99BankLogInPage.txtUserName(driver).sendKeys("mngr92205");
		  Guru99BankLogInPage.txtPassword(driver).sendKeys("epemygy");
		  Guru99BankLogInPage.btnLogin(driver).click();
		  
		  driver.quit();
  }
  @Test
  public void TestCase2(){
	  Assert.assertTrue(true);
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	
  }

  @AfterTest
  public void afterTest() {
  }

}