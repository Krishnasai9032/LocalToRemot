package TestNgDemo;

import org.testng.Assert;
import org.testng.annotations.Test;


public class HardAssertionDeom1 
{
	@Test
	public void funA()
	{
		System.out.println("funA of HardAssertionDemo1");
		String expectedValue="Selenium";
		String actualValue="Selenium";
		Assert.assertEquals(expectedValue, actualValue , "expected and acctual are not matching");
		System.out.println("Done");

	}
	@Test
	public void funB()
	{
		System.out.println("funB of HardAssertionDemo1");
		String expectedValue="Java";
		String actualValue="Selenium";
		Assert.assertEquals(expectedValue, actualValue,"expected and acctual are not matching");
		System.out.println("Done");


	}
	@Test
	public void funC()
	{
		System.out.println("funC of HardAssertionDemo1");
		String expectedValue="Java";
		String actualValue="Selenium";
		Assert.assertEquals(expectedValue, actualValue);	
		System.out.println("Done");

	}
	@Test
	public void funE()
	{
		System.out.println("funC of HardAssertionDemo1");
		// String expectedValue="Java";
		// String actualValue="Selenium";
		Assert.assertTrue(true);	
		System.out.println("Done");

	}

	@Test
	public void funF()
	{
		System.out.println("funC of HardAssertionDemo1");
		// String expectedValue="Java";
		// String actualValue="Selenium";
		Assert.assertTrue(false);	
		System.out.println("Done");

	}
	
	@Test
	public void funG()
	{
		System.out.println("funG of HardAssertionDemo1");
		// String expectedValue="Java";
		// String actualValue="Selenium";
		Assert.assertFalse(false);	
		System.out.println("Done");

	}
	@Test
	public void funH()
	{
		System.out.println("funH of HardAssertionDemo1");
		// String expectedValue="Java";
		// String actualValue="Selenium";
		Assert.assertFalse(true);	
		System.out.println("Done");

	}



}
