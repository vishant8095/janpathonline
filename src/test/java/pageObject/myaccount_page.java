package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class myaccount_page extends Basepage{

	     public myaccount_page(WebDriver driver)
	     {
	    	 super(driver);
	     }
	
	   @FindBy(xpath="//h1[text()='My Account']")
	   WebElement msgheading;
	  
	   public boolean ismytext()
	   {
		   try {
			  return(msgheading.isDisplayed());
		    }
		  catch(Exception e)
		  {
			  return false;
		  }
	   }
	
}
