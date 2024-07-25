package testBase;



import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;



public class baseclass {
	public WebDriver driver;
	public Logger logger;
	
	public Properties p;
	@Parameters({"os","browser"})
	@BeforeClass
	
	public void setup(String os , String br) throws IOException
	{
		FileReader file=new FileReader("./src//test//resources//config.property");
		p=new Properties();
		p.load(file);
		
		logger=LogManager.getLogger(this.getClass());
		
	switch(br.toLowerCase())	
	{
	case "chrome":driver=new ChromeDriver();break;
	case "edge":driver=new EdgeDriver();break;
	case "firefox":driver=new FirefoxDriver();break;
	default:System.out.println("invalide browser");return;
	}
	
	driver.get(p.getProperty("appUrl"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
		
	}
	@AfterClass
  public void teardown()
	{
		//driver.close();
		driver.quit();
	}
  public String randomstring()
	{
		String generatestring=RandomStringUtils.randomAlphabetic(5);
		return generatestring;
	}
	public String randomNumber()
	{
		String generatenumber=RandomStringUtils.randomNumeric(5);
		return generatenumber;
	}
	
	public String alphanumber()
	{
		String generatenumber=RandomStringUtils.randomNumeric(5);
		String generatestring=RandomStringUtils.randomAlphabetic(5);
		return (generatenumber+"@"+generatestring);
	} 

}
