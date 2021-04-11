package TestNG_Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class MultiBrowserCT
{
    @Parameters("browserName")
	@Test
	public void TC1(String browserName) throws InterruptedException
	{
	
    	WebDriver driver=null;
    	if(browserName.equals("chrome"))
    	{
    		System.setProperty("webdriver.chrome.driver","F:\\Velocity\\Velocity Selenium\\Browser Exe\\chromedriver_win32\\chromedriver.exe");
    	    driver=new ChromeDriver();
    	    driver.get("https://www.facebook.com/");
    	    driver.manage().window().maximize();
    	    Thread.sleep(3000);
    	    driver.close();
    	    
    	}
    	else if(browserName.equals("firefox"))
    	{
    		    	  	    	
		   System.setProperty("webdriver.gecko.driver","F:\\Velocity\\Velocity Selenium\\Browser Exe\\geckodriver-v0.29.1-win64\\geckodriver.exe");
           driver=new FirefoxDriver();
           driver.manage().window().maximize();        
           driver.get("https://www.flipkart.com/");
           Thread.sleep(3000);
           driver.close();
         
	   }
    	

	}
}
