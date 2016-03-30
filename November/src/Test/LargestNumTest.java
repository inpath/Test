package Test;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.AfterMethod;

import Examples.LargestNum;
	
		public class LargestNumTest{
	
				
		@Test
		public void Check(){
			
		LargestNum ln = new LargestNum();
		int [] arr = {11,115,35,67,70};
		int max = ln.findMax(arr);
		assertEquals(115,max);
		System.out.println("Test 1");
		}
		
		/*
		@Test
		public void Check1(){
			
		LargestNum ln = new LargestNum();
		int [] arr = {117,115,35,67,70};
		int expected = 116;
		actual = ln.findMax(arr);
		assertEquals(expected,actual);
		System.out.println("Test 2");
		}
	*/			
	}
	

