package project.test;

import static org.junit.Assert.*;

import org.junit.Test;

import Test.LargestNumber;

public class LargestNumberTest {
	int max1;
	LargestNumber ln = new LargestNumber();

	@Test
	public void getPositiveNumber()
	{
		
		int[] arr = {12,13,54,26};
		max1= ln.findMax(arr);
		assertEquals(54,max1);
	}
	
	@Test
	public void getNegativeNumber()
{
	

	int[] arr = {-2,-11,-32,-44};
	max1=ln.findMax(arr);
	assertEquals(-2,max1);
	System.out.println("the maximum number is " + max1);
}
	@Test
	public void getMix()
	{
	
		
		int[] arr = {-1,23,44,-6};
		max1=ln.findMax(arr);
		assertEquals(44,max1);
		System.out.println("This is null array" );

	}
	
	@Test(expected=Exception.class)
	public void getNull()
	{
		
		
		int[] arr =null;
		max1=ln.findMax(arr);
		assertEquals(null,max1);
		
		
	}
	
}
