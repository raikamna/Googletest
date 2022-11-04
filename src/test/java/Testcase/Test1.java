package Testcase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Objectrepo.Baseclass;

public class Test1 extends Baseclass {
	
	@Test(priority=1)
	public void verifygooglesearchprocess() throws InterruptedException {
		//driver.get(baseURL);
		
		WebElement l= driver.findElement(By.name("q"));
	 	l.sendKeys("Amazon");
	 
	 	WebElement cl= driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']"));
	 	cl.click(); 
	}
	
	@Test(priority=2)
	public void clickOnSearchedUrl() throws InterruptedException {
	
	Thread.sleep(5000);
	WebElement amazon = driver.findElement(By.xpath("//h3[normalize-space()='Amazon.in']"));
 	amazon.click();
 	
 	Thread.sleep(20000);
 	
	}
}