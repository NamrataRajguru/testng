package TestNG_Examples;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testAnnotatio_2 
{
	@Test
	public void TC1()
	{
		Reporter.log("running TC1",true);
	}
	
	@Test
	public void TC2()
	{
		Reporter.log("running TC2",false);
	}

}
