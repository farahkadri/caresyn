package Ebay.prjct;
import org.testng.annotations.*;
import org.testng.Assert;
import org.testng.ITestResult;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class buy {


	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","E:\\Drivers\\win_chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.co.uk");

	}
	
	@Test
	public void filterTest()
	{		
	     driver.findElement(By.id("e1-24")).click();
	     WebElement Element = driver.findElement(By.id("e1-41"));
	     JavascriptExecutor js = (JavascriptExecutor) driver;
	        //This will scroll the page till the element is found		
	     js.executeScript("arguments[0].scrollIntoView();", Element);
         Element.click();

	}
     
	
	
 	
	
	
	@AfterMethod	
	public void tearDown() {
			driver.close();
	}



}
