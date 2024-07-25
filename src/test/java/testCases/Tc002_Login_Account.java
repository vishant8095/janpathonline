package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.Login_page;
import pageObject.myaccount_page;
import testBase.baseclass;

public class Tc002_Login_Account extends baseclass {
	
	@Test
	public void verifylogin()
	{
		
		logger.info("******Tc002_login account started*****");
		try {
		HomePage hp=new HomePage(driver);
		hp.click_myaccount();
		Login_page li=new Login_page(driver);
		
		li.setemail(p.getProperty("Email"));
		li.setpassword(p.getProperty("password"));
		Thread.sleep(2000);
		li.clicksignin();
		
		myaccount_page mc=new myaccount_page(driver);
		boolean targetpage=mc.ismytext();
		
		Assert.assertEquals(targetpage,true,"login failled");
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		finally 
		{
		logger.info("***** Finished TC002_login account *****");
		}
	}
	
	

}
