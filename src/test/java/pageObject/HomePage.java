package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Basepage {

	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="(//span[@class='icon icon-new icon-header-account '])[1]")
	 WebElement lnk_Myaccount;
	@FindBy(xpath="//a[normalize-space()='Create account']")
	 WebElement create_accont;
	
	public void click_myaccount()
	{
		lnk_Myaccount.click();
	}
	public void clic_create()
	{
		create_accont.click();
	}
}
