package sampleDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;

public class SamplePage {
	
public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.com/");
		
		System.setProperty("webdriver.chrome.driver",  "chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		
		
		
		WebElement input = driver.findElement(By.id("twotabsearchtextbox"));
		input.sendKeys("toys");
		
		driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input")).click();
		
		List <WebElement> totalLinks = driver.findElements(By.tagName("a"));
		
		 	
		System.out.println("Links : "+totalLinks.size());
		
		driver.findElement(By.xpath(".//*[@id='nav-xshop']/a[2]")).click();
		//for(int i=0; i<todaysDeal.size();i++){
			//if (todaysDeal[i] = ("/gp/goldbox/ref=nav_cs_gb"))
				
				
		//if (todaysDeal. = "/gp/goldbox/ref=nav_cs_gb")
			
		//}
		//driver.getTitle();
		System.out.println(driver.getTitle());
		driver.quit();
}
}