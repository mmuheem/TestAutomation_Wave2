package demoTesting_Phase1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2
{

	@Test()
	public void testA()
	{
		Reporter.log("testB is executed",true);
		//forcing this method to fail.
		//Assert.fail();
	}		
	
	@Test()
	public void testB()
	{
		Reporter.log("testC is executed",true);		
	}
	
	//below method will executed only when testA and testB method is passed.
	@Test (dependsOnMethods = {"testA","testB"})
	public void testC()
	{
		Reporter.log("testD is executed",true);
	}
}
