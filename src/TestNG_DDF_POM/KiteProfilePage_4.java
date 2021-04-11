package TestNG_DDF_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteProfilePage_4
{
    @FindBy(xpath=" //a[text()=' Logout']")WebElement logout;
    
    KiteProfilePage_4(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void setKiteProfilePage_4LogoutBtn()
    {
    	logout.click();
    }
    
    
	
}
