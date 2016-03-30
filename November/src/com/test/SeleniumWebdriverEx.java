package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Document;

public class SeleniumWebdriverEx {

	 public static void main(String args[] ){
		 
		 WebDriver driver = new FirefoxDriver();
		 
		 driver.get("https://www.google.com/intl/en/mail/help/about.html");
			driver.manage().window().maximize();
			WebElement createAccBtn = driver.findElement(By.className("maia-button"));
			createAccBtn.click();
			WebElement firstName = driver.findElement(By.id("FirstName"));
			firstName.sendKeys("inpath");
			
			WebElement lastName = driver.findElement(By.id("LastName"));
			lastName.sendKeys("abc");
			
			WebElement gmailAdd = driver.findElement(By.xpath("//*[@id='GmailAddress']"));
			gmailAdd.sendKeys("inpathabc1");
			
			WebElement pwd = driver.findElement(By.cssSelector("input[name='Passwd']"));
			pwd.sendKeys("inpathabc2");
			
			WebElement pwdAgain = driver.findElement(By.cssSelector("input[name='PasswdAgain']"));
			pwdAgain.sendKeys("inpathabc2");
			WebElement dropdown = driver.findElement(By.xpath(".//*[@id='BirthMonth']/div[1]"));
			dropdown.click();
			
			driver.manage().timeouts().implicitlyWait(50000,TimeUnit.SECONDS);
			
			//JavascriptExecutor js = (JavascriptExecutor)driver;

						
			
			WebElement element1 = driver.findElement(By.xpath(".//*[@id=':4']/div"));
		//WebElement element1 = driver.findElement(By.xpath(".//*[@id='BirthMonth']/div[2]/div[2]/div"));

			driver.manage().timeouts().implicitlyWait(50000,TimeUnit.SECONDS);
			element1.click();
			driver.close();
			
			//div[@class='chzn-drop']//li[contains(text(),'1001 (2015-04-29 10:49:11)')]
			//WebElement month=driver.findElement(By.xpath(".//*[@id=':3']/div"));
			////div[@class='goog-menuitem-content']
			
			//driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
			//month.click();
			
			/*
			 * 
			 *JavascriptExecutor js = (JavascriptExecutor)driver;

			js.executeScript("document.getElementById(div element id).click()");
			 */
			
			
	//		WebElement monthselect = driver.findElement(By.id(":4"));
	//		monthselect.click();
	//	 Select select = new Select(dropdown);
	//	 driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
	//	 select.selectByIndex(4);
//		 driver.navigate().back();
//		 driver.navigate().forward();
//		 driver.navigate().to("https://www.google.com/");
		 
		// driver.close();
		
		 /*
		  
		 
		 driver.get("https://accounts.google.com/ServiceLogin?");
		 driver.manage().window().maximize();
		 WebElement element = driver.findElement(By.xpath(".//*[@id='lang-chooser']"));
		 
		 Select select = new Select(element);
		 driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
		 
		 System.out.println("came till here again ");
		 select.selectByValue("da");
		 */
		 
		 
		 
	 }
	
}
