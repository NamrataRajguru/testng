package TestNG_Examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ExampleofNormalTestClass 
{
	public static void main(String[] args) throws InterruptedException {
		
	  System.setProperty("webdriver.chrome.driver","F:\\\\Velocity\\\\Velocity Selenium\\\\Browser Exe\\\\chromedriver_win32\\\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	  
	   driver.manage().window().maximize();
	   driver.get("https://www.flipkart.com/");
	   Thread.sleep(3000);
	   
	   driver.close();
	   
	}

}
