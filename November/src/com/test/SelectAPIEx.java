package com.test;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class SelectAPIEx {

	
	 public static void main(String args[] ){
	WebDriver driver = new FirefoxDriver();
	
	driver.get("http://www.trulia.com");
	driver.manage().window().maximize();
	
	WebElement element = driver.findElement(By.id("search_options"));
	//
	
	Select select = new Select(element);
	List <WebElement> allOptions = select.getOptions();
	System.out.println(allOptions.size());
	
	driver.manage().timeouts().implicitlyWait(30000,TimeUnit.MILLISECONDS);
	//select.selectByIndex(1);
	select.selectByValue("for_rent");
	
	
	 WebElement e1 = driver.findElement(By.xpath(".//*[@id='searchbox_form_location']"));
	 e1.sendKeys("foster City");
	 WebElement e2 = driver.findElement((By.xpath(".//*[@id='searchbox_form']/div/button")));
	 e2.click();
	 
	 
//	 for (WebElement options : allOptions)
//			{
//				if ("Rent".equals(options.getText()))
//					options.click();
//				System.out.println(options.getText());
//			}
	
}	
	
	}

