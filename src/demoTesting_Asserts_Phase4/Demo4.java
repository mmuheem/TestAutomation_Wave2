package demoTesting_Asserts_Phase4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo4
{
	@Test
	public void testA()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
	    String aTitle = driver.getTitle();
		String eTitle = "actiTIME - Login123";
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(aTitle, eTitle);
		Reporter.log("Title is matching...",true);
		driver.close();
	}
}
