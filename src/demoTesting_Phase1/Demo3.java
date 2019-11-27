package demoTesting_Phase1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 
{
	
	@Test
	public void testD()
	{
		Reporter.log("User2 created",true);
	}
	
	@Test (enabled = false)
	public void testE()
	{
		Reporter.log("User2 edited",true);
	}
	
	@Test
	public void testF()
	{
		Reporter.log("User2 deleted",true);
	}

}
