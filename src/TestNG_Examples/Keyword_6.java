package TestNG_Examples;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword_6 
{
	@Test()
	public void loginToApp1()
	{
		Reporter.log("running login to app1",true);
		Assert.fail();
	}
	
	@Test()
	public void loginToApp2()
	{
		Reporter.log("running login to app2",true);
		Assert.fail();
	}
	
	//@Test(dependsOnMethods= {"loginToApp1"}) -- for single method 
	@Test(dependsOnMethods= {"loginToApp1,loginToApp2"})
	public void logoutToApp()
	{
		Reporter.log("running logout to app",true);
	}

}
