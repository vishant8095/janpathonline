package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_page extends Basepage{
	
	public Login_page(WebDriver driver)
	{
		super(driver);
	}
	
	
	
      @FindBy(xpath="//input[@id='CustomerEmail']")
      WebElement txtEmail;
      @FindBy(xpath="//input[@id='CustomerPassword']")
      WebElement txtpassword;
      @FindBy(xpath="//button[.='Sign In']")
      WebElement btnsign;

   public void setemail(String str)
   {
	txtEmail.sendKeys(str);
   }
   public void setpassword(String str)
   {
 	txtpassword.sendKeys(str);
   }
   public void clicksignin()
    {
    	btnsign.click();
    }

    }
