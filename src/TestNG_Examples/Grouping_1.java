package TestNG_Examples;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping_1 
{
	@Test(groups="orders")
	public void TC1()
	{
		Reporter.log("TC1",true);
	}
	
	@Test(groups="setting")
	public void TC2()
	{
		Reporter.log("TC2",true);
	}

	
	@Test(groups="orders")
	public void TC3()
	{
		Reporter.log("TC3",true);
	}

	
	@Test(groups="dashboard")
	public void TC4()
	{
		Reporter.log("TC4",true);
	}

	@Test(groups="dashboard")
	public void TC5()
	{
		Reporter.log("TC5",true);
	}

	@Test(groups="fund")
	public void TC6()
	{
		Reporter.log("TC6",true);
	}


}
