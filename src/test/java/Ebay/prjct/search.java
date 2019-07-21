package Ebay.prjct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class search {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","E:\\Drivers\\win_chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.co.uk");

	}
	
	@Test
	public void searchTest()
	{		
	     driver.findElement(By.id("gh-ac")).sendKeys("Intel NUC");
	     driver.findElement(By.id("gh-btn ")).click();
		 String verifiedrange1= driver.findElement(By.cssSelector("#cbelm > div.clt > h1 > span.kwcat")).getText();
		 Assert.assertEquals(verifiedrange1, "426 results for intel nuc");
		
	}
	
	@AfterMethod	
	public void tearDown() {
			driver.close();
	}



}


}
