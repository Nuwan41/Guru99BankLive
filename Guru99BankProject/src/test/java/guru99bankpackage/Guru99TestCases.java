package guru99bankpackage;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//import org.testng.asserts.SoftAssert;
import com.google.common.base.Verify;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.TTCCLayout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import pageobjects.Guru99BankLogInPage;
import pageobjects.Managerhomepage;
import utility.Constants;

//Testing Git - Testing Reply From GitHub v0.03 - 09/03/2017

public class Guru99TestCases {
	WebDriver driver;
  @Test
  public void f() {
	  
	  System.out.println("Hello Nuwan. Welcome to Guru99Bank");
  }
  @Test
  public void TestCase1() {
	  /*
	  	System.setProperty("webdriver.gecko.driver", Constants.geckoDriverPath);
		  driver=new FirefoxDriver();
		  */
	  	/* >>>>>>>>
		System.setProperty("webdriver.chrome.driver", Constants.chromeDriverPath);
  		driver = new ChromeDriver();  	
  		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 */ 
		  
		  
	  /*
		  System.setProperty("webdriver.chrome.driver", Constants.chromeDriverPath);
		  driver=new ChromeDriver();
		  */
		  //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  //driver.get(Constants.url);
		
		 /*
		  Guru99BankLogInPage.txtUserName(driver).sendKeys("mngr92205");
		  Guru99BankLogInPage.txtPassword(driver).sendKeys("epemygy");
		  */
	  
	  	WebDriver driver = null;
	  	driver=appModules.LounchBrowser.LounchChrome(driver);
	  	
	  	
	  	/*
		  Guru99BankLogInPage.txtUserName(driver).sendKeys("mngr95874");
		  Guru99BankLogInPage.txtPassword(driver).sendKeys("bEtEqYs");
		  */
		  Guru99BankLogInPage.txtUserName(driver).sendKeys(Constants.userName);
		  Guru99BankLogInPage.txtPassword(driver).sendKeys(Constants.passWord);
		  
		  Guru99BankLogInPage.btnLogin(driver).click();
		  
		  //String ExpectedTitle="Guru99 Bank Home Page";
		  String ExpectedTitle="Guru99 Bank Manager HomePage";
		  //String ActualTitle=Managerhomepage.TtlWelcomeManagerPage(driver).getText();	
		  String ActualTitle= driver.getTitle();
		  System.out.println(ActualTitle);
		  
		 Assert.assertTrue(ActualTitle.equals(ExpectedTitle));
		 System.out.println("Actual Title "+ActualTitle); 
		 System.out.println("Expected Title "+ExpectedTitle); 
		  //Verify.verify(ActualTitle.equals(ExpectedTitle));
		  //driver.quit();
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
