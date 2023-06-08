package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseTestFacebook implements AutoConstant
{
   public WebDriver driver;
	
	@BeforeSuite
	public void executionStart()
	{
		System.out.println("execution started");
	}
	
	@BeforeClass
	public void setup()
	{
		System.setProperty(chrome_key, chrome_value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url2);
	}
	
	@AfterClass
	public void teardown()
	{
	  //driver.close();
	}
	
	@AfterSuite
	public void executionComplete() throws InterruptedException
	{
	System.out.println("execution ends......");
	}
}
