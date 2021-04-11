package TestNG_Examples;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample3
{

	@Test()
	public void TC2()
	{
		Reporter.log("Running Tc2", true);
	}
	
	@Test()
	public void TC1()
	{
		Reporter.log("Running Tc1", true);
	}
	

}
