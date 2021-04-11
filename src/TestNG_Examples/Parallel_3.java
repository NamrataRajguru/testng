package TestNG_Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_3
{

	@Test
	public void Google() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\Velocity\\Velocity Selenium\\Browser Exe\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        
        driver.get("https://www.google.co.in/");
        driver.close();
        
	}
}
