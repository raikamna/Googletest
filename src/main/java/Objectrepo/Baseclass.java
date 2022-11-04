package Objectrepo;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass {
	
	public static WebDriver driver;
	public String baseURL = "https://www.google.com/";
	@BeforeClass
	public void setUp() 
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	

	@AfterClass
	public void down() throws Exception
	{		
		Thread.sleep(50);
		driver.quit();
	}

}
