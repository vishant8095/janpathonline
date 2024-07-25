package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Accountreg_page extends Basepage{
	
	
	public  Accountreg_page(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='RegisterForm-FirstName']")
	WebElement txtFirstname;
	@FindBy(xpath="//input[@id='RegisterForm-LastName']")
	WebElement txtLastname;
	@FindBy(xpath="//input[@id='RegisterForm-email']")
	WebElement txtEmail;
	@FindBy(xpath="//input[@id='RegisterForm-password']")
	WebElement txtPassword;
	@FindBy(xpath="//button[normalize-space()='Create']")
	WebElement btnLogin;
	
	public void setFirstname(String str)
	{
		txtFirstname.sendKeys(str);
	}
	public void setLastname(String str)
	{
		txtLastname.sendKeys(str);
	}
	public void setEmail(String str)
	{
		txtEmail.sendKeys(str);
	}
	public void setPassword(String str)
	{
		txtPassword.sendKeys(str);
	}
	public void clicklogin()
	{
		btnLogin.click();
	}
}
