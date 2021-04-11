package TestNG_DDF_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{
	@FindBy(xpath="//div[@class='avatar']/span") WebElement Profile;
	
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setKiteHomePagePN(String expPN)
	{
		String actPN=Profile.getText();		
	
		
		if(actPN.equals(expPN))
		{
			System.out.println("Pass");
		}else
		{
			System.out.println("Fail");
		}
		
		
	}
	
	public void clickKiteHomePagePN() 
	{
		Profile.click();
	}
	
	 

}
