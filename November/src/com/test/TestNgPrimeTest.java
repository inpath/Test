package com.test;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.main.TestNgPrime;
public class TestNgPrimeTest {
	

		TestNgPrime pn = new TestNgPrime();
		
		@Test
		public void testPrime()
		{
			boolean actual = pn.isPrime(27);
			
		boolean expected=true;
		Assert.assertEquals(actual, expected);
			
			System.out.println("Test Passed");
		}
		
		@Test
		public void testPrime1()
		{
			boolean actual = pn.isPrime(26);			
			boolean expected=false;
		Assert.assertEquals(actual, expected);
			
			System.out.println("Test Passed");
		}
		
		@Parameters
		@Test
		public void testPrint(String primeValue)
		{
			System.out.println(primeValue);
		}
		
 }
		
	

