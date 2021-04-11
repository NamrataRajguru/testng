package TestNG_DDF_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2Page 
{

	@FindBy(xpath=" //input[@id='pin']") WebElement Pin;
	
	@FindBy(xpath=" //button[text()='Continue ']") WebElement CntBtn;
	
	
	public KiteLogin2Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void setKiteLogin2PagePin(String PinValue)
	{
		Pin.sendKeys(PinValue);
	}
	
	public void setKiteLogin2PageCntBtn()
	{
		CntBtn.click();
	}
	
}
