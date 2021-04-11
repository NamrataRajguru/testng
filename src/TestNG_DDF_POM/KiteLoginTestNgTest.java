package TestNG_DDF_POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteLoginTestNgTest
{
	KiteLogin1Page Login1;
	KiteLogin2Page Login2;
	KiteHomePage Home;
	KiteProfilePage_4 profile;
	Sheet sh;
	WebDriver driver;
	
	
   @BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException, InterruptedException
	{
		FileInputStream file=new FileInputStream("F:\\Velocity\\ScreenShots\\ExcelSheet\\Framework.xlsx");
		sh=WorkbookFactory.create(file).getSheet("Sheet1");
		System.setProperty("webdriver.chrome.driver","F:\\Velocity\\Velocity Selenium\\Browser Exe\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		driver.get("https://kite.zerodha.com/#loggedout");
		Thread.sleep(3000);
		
		 Login1=new KiteLogin1Page(driver);
		 Login2=new KiteLogin2Page(driver);
		 Home=new KiteHomePage(driver);
		 profile=new KiteProfilePage_4(driver);
		
	}
	
   @BeforeMethod
   public void loginToApp()
   {
	   Login1.setKiteLogin1PageUsername(sh.getRow(0).getCell(0).getStringCellValue());
	   Login1.setKiteLogin1PagePassword(sh.getRow(0).getCell(1).getStringCellValue());
	   Login1.setKiteLogin1PageLoginBtn();
	   
	   Login2.setKiteLogin2PagePin(sh.getRow(0).getCell(2).getStringCellValue());
	   Login2.setKiteLogin2PageCntBtn();
   }
   
      
   @Test
   public void verifyPn()
   {
	 //  String actPin="";
	   //String expPin="";
	   
	   
	   Home.setKiteHomePagePN(sh.getRow(0).getCell(3).getStringCellValue());
   }
   
   @BeforeMethod
   public void logoutFromApp()
   {
	   Home.clickKiteHomePagePN();
	   profile.setKiteProfilePage_4LogoutBtn();
	   
   }
   
   @AfterClass
   public void closeBrowser()
   {
	   driver.close();
   }
	
	


	
}
