package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.Accountreg_page;
import pageObject.HomePage;
import testBase.baseclass;


public class Tc001Account_reg_page extends baseclass{
	
	@Test
	public void verifyaccount()
	{
		
		logger.info("***** Starting TC001_AccountRegistrationTest  ****");
		logger.debug("This is a debug log message");
		try {
		HomePage hm= new HomePage(driver);
		hm.click_myaccount();
		hm.clic_create();
		
		Accountreg_page ac=new Accountreg_page(driver);
		ac.setFirstname(randomstring());
		ac.setLastname(randomstring());
		ac.setEmail(randomstring()+"@gmail.com");
		ac.setPassword(alphanumber());
		ac.clicklogin();
		}
		catch(Exception e)
		{
			logger.error("Test failed: " + e.getMessage());
			Assert.fail("Test failed: " + e.getMessage());
		}
		finally 
		{
		logger.info("***** Finished TC001_AccountRegistrationTest *****");
		}
	}
	
	
	
}
