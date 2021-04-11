package TestNG_Examples;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Verification_Assert_7 
{
	//6.assertNull
	@Test
	public void TC()
	{
		String str="Hi";
		Assert.assertNull(str,"exp result is not null");
	}
	
	
	
	
//	5.assertNotNull
//	@Test()
//	public void TC1()
//	{
//		String str= null;
//		Assert.assertNotNull(str,"exp result is null");
//	}
//	
	
	
//	//4.assertFalse
//	@Test()
//	public void TC1()
//	{
//		boolean result=false;
//		Assert.assertFalse(result,"test case is true");
//		
//	}
	
	
	
	//3.assertTrue
//	@Test
//	public void TC1()
//	{
//		boolean result =false;
//		Assert.assertTrue(result);
//		//Assert.assertTrue(result,"actual result is false");
//	}
	
	
	
	
	//2.assertNotEquals
//	@Test
//	public void TC1()
//	{
//		String exp="Hi";
//		String act="Hello";
//		
//	Assert.assertNotEquals(exp, act,"both result are same");	
//	}

	
	
	
	//1. assertEquals
//	@Test
//	public void TC1()
//	{
//		String exp="Hi";
//		String act="Hello";
//		
//		Assert.assertEquals(exp, act,"exp and actual result are differnet");
//	}
	
	
	
	

}
