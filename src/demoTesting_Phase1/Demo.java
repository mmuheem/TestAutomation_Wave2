package demoTesting_Phase1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo 

{
    final int p=3;
	@Test(priority = 2 , invocationCount = 10)
	public void demoA()
	{
		Reporter.log("User edited",true);
	}
	
	@Test(priority = 1)
	public void demoB()
	{
		Reporter.log("User created", true);
	}
	
	@Test(priority = p)
	public void demoC()
	{
		Reporter.log("User deleted",true);
	}
}
