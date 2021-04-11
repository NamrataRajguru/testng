package TestNG_Examples;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations_4
{
	
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("Open Browser",true);
	}
	
	@BeforeMethod
	public void loginToApp()
	{
		Reporter.log("Login to app",true);
	}
	
	
	@Test
	public void TC1()
	{
		Reporter.log("running  TC1...",true);
	}
	
	@Test
	public void TC2()
	{
		Reporter.log("running TC2",true);
	}
	
	
	@AfterMethod
	public void logoutFromApp()
	{
		Reporter.log("Logout From app", true);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("Close Browser",true);
	}
	

}
