package demoTesting_Asserts_Phase4;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Demo6_Listerner 
{
	@Test
	public void testA()
	{
		Reporter.log("Hi...",true);
		Assert.fail();	
	}
	
	@Test
	public void testB()
	{
		Reporter.log("Hello...",true);
	}
	
	@AfterMethod
	public void Verify(ITestResult res)
	{
		int value = res.getStatus();
		String name = res.getName();
		Reporter.log(value+"  "+name,true);
	}
	

}
