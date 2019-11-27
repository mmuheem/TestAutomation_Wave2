package demoTesting_Phase2;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 extends BaseTest

{
	@Test()
	public void testB()
	{
		Reporter.log("TestB method",true);
	}
}
