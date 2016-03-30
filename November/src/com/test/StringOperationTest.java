package com.test;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import com.main.StringOperation;


public class StringOperationTest {
	
	StringOperation so;
	@BeforeMethod
	public void setObject()
	{
		so=new StringOperation();
	}
	
  @Test
  public void checkVowels() {
	  int actual = so.countVowels("testng demo class");
	  assertEquals(4,actual);
	  System.out.println("There are 4 vowels");
	  
  }
  @Test
  public void checkVowels1(){
	  int actual = so.countVowels("BDFRTG");
	  assertEquals(0,actual);
	  System.out.println("This are zero vowels");
  }
  
  @AfterMethod
  public void clearObject(){
	  so=null;
  }
  
  
}