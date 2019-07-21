package Ebay.prjct;
import org.testng.annotations.*;
import org.testng.Assert;
import org.testng.ITestResult;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class createUser {


	@Test
	public class tcbasicAuth {

		WebDriver driver;
		
		@BeforeMethod
		public void setUp() {
			System.setProperty("webdriver.chrome.driver","E:\\Drivers\\win_chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.ebay.co.uk");

		}
		
		@Test
		public void createUserTest()
		{		
	     
			
		}
		
		@AfterMethod	
		public void tearDown() {
				driver.close();
		}



		}

	public class buy {




	@Test
	public class tcbasicAuth {

		WebDriver driver;
		
		@BeforeMethod
		public void setUp() {
			System.setProperty("webdriver.chrome.driver","E:\\Drivers\\win_chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.ebay.co.uk");

		}
		
		@Test
		public void createUserTest()
		{		
		     WebElement register= driver.findElement(By.xpath("//*[@id=\"gh-ug-flex\"]/a"));
		     register.click();
		     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		     driver.findElement(By.id("firstname")).sendKeys("Farah");
		     driver.findElement(By.id("lastname")).sendKeys("KKKK");
		     driver.findElement(By.id("email")).sendKeys("far.kadri@gmail.com");
		     driver.findElement(By.id("PASSWORD")).sendKeys("Mumbai@12");
		     driver.findElement(By.id("promotion")).click();

			
		}
		
		@AfterMethod	
		public void tearDown() {
				driver.close();
		}



		}
