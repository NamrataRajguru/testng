package TestNG_DDF_POM;


    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class KiteLogin1Page 
	{
	   @FindBy(xpath="//input[@type='text']") private WebElement UN;
	   @FindBy(xpath="//input[@type='password']") private WebElement PWD;
	   @FindBy(xpath="//button[@type='submit']") private WebElement Login;
	   
	   public KiteLogin1Page(WebDriver driver)
	   {
		   PageFactory.initElements(driver,this);
	   }
	   
	   
	   public void setKiteLogin1PageUsername(String UserName)
	   {
		   UN.sendKeys(UserName);
	   }
	   
	   public void setKiteLogin1PagePassword(String Password)
	   {
		   PWD.sendKeys(Password);
	   }
	   
	   public void setKiteLogin1PageLoginBtn()
	   {
		   Login.click();
	   }



	}


