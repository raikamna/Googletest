package Objectrepo;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public static WebDriver driver;
	public String baseURL = "https://www.google.com/";
	
	@BeforeClass
	public void setUp() 
	{
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver.exe");
      // driver = new ChromeDriver();
       //driver.manage().window().maximize();
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeOptions);
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
