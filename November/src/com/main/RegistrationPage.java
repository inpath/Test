package com.main;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class RegistrationPage {

WebDriver driver;

public RegistrationPage(WebDriver driver){
	
	this.driver=driver;
	
	}
//public WebElement ValidateRegistrationPage(){

	public void ValidateRegistrationPage(){
	driver.get("https://www.google.com/intl/en/mail/help/about.html");
	driver.manage().window().maximize();
	WebElement createAccBtn = driver.findElement(By.className("maia-button"));
	createAccBtn.click();
	
	
/*	String pagesource = driver.getPageSource();
	System.out.println("Page source " + pagesource);
	
	List <WebElement> totalLinks = driver.findElements(By.tagName("a"));
	System.out.println("Links : "+totalLinks.size()); */

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
	
//	WebElement nextBtn = driver.findElement(By.id("submitbutton"));
//	nextBtn.click();
	
	//WebElement dropdown = driver.findElement(By.xpath(".//*[@id='BirthMonth']/div[1]"));
		//WebElement dropdown =driver.findElement(By.name("BirthMonth"));
		//dropdown.click();
		//WebElement dropdown = driver.findElement(By.xpath(".//*[@id='BirthMonth']/div"));
		
			//Select select = new Select(dropdown);
			
			//select.selectByIndex(4);
			
		//	select.selectByValue("April");
	WebElement dropdown = driver.findElement(By.xpath(".//*[@id='BirthMonth']/div[1]"));
		dropdown.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement monthselect = driver.findElement(By.id(":4"));
		monthselect.click();
		
		//WebElement dropdown1 = driver.findElement(By.xpath(".//*[@id=':4']"));
		//try {
		//	wait(2000);
		//} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}
		//dropdown1.click();
		//Select select = new Select(dropdown);
		//select.selectByValue("April");
			System.out.println("done");
			//driver.quit();
	
	String ss = driver.getTitle();
	System.out.println("Title is " + ss);
	 driver.get(ss); 
	
	
//	className("errormsg")
	
//	 WebElement errorMsg = driver.findElement(By.id("errormsg_0_BirthYear"));
//		return errorMsg;
}
}



