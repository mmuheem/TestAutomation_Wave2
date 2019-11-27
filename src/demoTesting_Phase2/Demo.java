package demoTesting_Phase2;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo extends BaseTest
{
	
	@Test()
	public void demoA()
	{
		Reporter.log("User Created",true);
	}
	
	@Test()
	public void demoB()
	{
		Reporter.log("User Deleted",true);
	}
}
