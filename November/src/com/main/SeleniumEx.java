package com.main;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
// couldn't find attached source
public class SeleniumEx {


static void manageDragAndDrop()
{
	WebDriver driver =new FirefoxDriver();
	driver.get("http://dhtmlx.com/docs/products/dhtmlxTree/");
	driver.manage().window().maximize();
	
	WebElement from = driver.findElement(By.xpath(".//*[@id='treebox1']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
	WebElement to =   driver.findElement(By.xpath(".//*[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
	
	Actions builder = new Actions(driver);
	Action dragAndDrop = builder.clickAndHold(from).moveToElement(to).release(to).build();
	dragAndDrop.perform();
}

static void manageCookies(){
	WebDriver driver =new FirefoxDriver();
	driver.get("http://www.amazon.com/");
	driver.manage().window().maximize();
	
	 Iterator <Cookie> mycookies = driver.manage().getCookies().iterator();
	while(mycookies.hasNext())
	{
		Cookie onecookie = mycookies.next();
		System.out.println("Name "+onecookie.getName()+" Value : "+onecookie.getValue());
	}
	Cookie insertCookie = new Cookie("NO_DATA", "WhiteBox");
	driver.manage().addCookie(insertCookie);
	System.out.println("Name "+insertCookie.getName()+" Value added: "+insertCookie.getValue());
}
static void manageSelect(){
	WebDriver driver =new FirefoxDriver();
	driver.navigate().to("https://accounts.google.com/SignUp?service=mail&continue=http%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav-about-en");
	driver.manage().window().maximize();
	//driver.findElement(By.xpath(".//*[@id='BirthMonth']/div[1]"));
//	try {
//		Thread.sleep(2000);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	//WebElement dropdown = driver.findElement(By.xpath(".//*[@id='BirthMonth']/div[1]"));
	WebElement dropdown =driver.findElement(By.name("BirthMonth"));
	//dropdown.click();
	
		Select select = new Select(dropdown);
		select.selectByValue("April");
		System.out.println("done");
		driver.quit();

}


public static void main(String[] args) {
	manageSelect();
	//manageCookies();
	//manageDragAndDrop();	
}	
	
}
