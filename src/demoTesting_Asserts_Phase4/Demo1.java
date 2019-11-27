package demoTesting_Asserts_Phase4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 
{
	@Test
	public void testB()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		boolean value = driver.findElement(By.id("loginButton")).isDisplayed();
		Assert.assertTrue(value);
		Reporter.log("Element is displayed",true);
		driver.close();
	}
}