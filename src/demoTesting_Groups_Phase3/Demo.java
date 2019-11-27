package demoTesting_Groups_Phase3;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo 
{
	
	@BeforeMethod(alwaysRun = true)
	public void login()
	{
		Reporter.log("Login successfull...",true);
	}
	
	@AfterMethod(alwaysRun = true)
	public void logout()
	{
		Reporter.log("Logout successfull...",true);
	}
	
	@Test(priority = 1, groups = {"smoke", "user"})
	public void demoA()
	{
		Reporter.log("User is created",true);
	}
	
	@Test(priority = 2, groups = {"user"})
	public void demoB()
	{
		Reporter.log("User is edited",true);
	}
	
	@Test(priority = 3, groups = {"user"})
	public void demoC()
	{
		Reporter.log("User is deleted",true);
	}
	
	@Test(priority = 4 , groups = {"smoke","task"})
	public void demoD()
	{
		Reporter.log("Task is created",true);
	}
	
	@Test(priority = 5, groups = "task")
	public void demoE()
	{
		Reporter.log("Task is edited",true);
	}
	
	@Test(priority = 6, groups = "task")
	public void demoF()
	{
		Reporter.log("Task is deleted",true);
	}
}
