package TestNG_Examples;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Verification_SoftAssert_8
{
	@Test
	public void TC1() {

		String exp="Hi";
		String act="Hi";
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(exp, act);
		soft.assertNotEquals(exp, act);
		soft.assertNotEquals(exp, act);
		
		soft.assertAll();
		
		
	}
	
	
//	@Test()
//	public void TC1()
//	{
//		String exp="Hi";
//		String act="Hi";
//		Assert.assertNotEquals(exp,act);
//		Assert.assertEquals(exp,act);
//		Assert.assertNotEquals(exp, act);
//	}
	
	
	

}
