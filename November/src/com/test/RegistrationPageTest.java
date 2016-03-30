package com.test;

import static org.testng.AssertJUnit.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import org.openqa.selenium.TakesScreenshot;

import com.main.RegistrationPage;


//import utils.BrowserCapabilities;

public class RegistrationPageTest {
WebDriver driver;
RegistrationPage page;

@BeforeClass
public void init(){
	
	driver = new FirefoxDriver();
	page = new RegistrationPage(driver);
	
	}
@Test
public void testValidateRegistration(){
	//WebElement testElement = page.ValidateRegistrationPage();
	
	//String actual =testElement.getText();
	//String expected ="You can't leave this empty.";
	//assertEquals(expected,actual);
	page.ValidateRegistrationPage();
	System.out.println("Hi");
}


@Test
public void testGetTitle(){
String s = driver.getTitle();
	System.out.println("Title of page : "+ s);
}
	//public void captureScreen(){
//BrowserCapabilities bc = new BrowserCapabilities();
//bc.screenShotEx();
// driver.get("https://www.google.com/intl/en/mail/help/about.html");

 
 
/* File file = ((TakesScreenShot)driver).getScreenshotAs(OutputType.FILE);

 
	 if (file.exists()) throws IOException
	 {
		FileUtils.copyFile(file, new File("c://Desktop//screen1.png")); 
		throw new IOException("your message");
	 }
	 
	 System.out.println(file.getAbsolutePath());
  
}*/
@AfterClass(enabled = false)
public void exit(){
	
	if(driver != null)
		driver.quit();
}
}
