package Generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseTest  implements AutoConstant 
{
	public static WebDriver driver;

	@BeforeSuite
	public void executionStart()
	{
		Reporter.log("execution started for suite level");
	}

	//(used for cross browser)@Parameters("browser")

	@BeforeClass
	public void setup()//String browser
	//{
	//if (browser.equalsIgnoreCase("chrome"))
	{
		//ChromeOptions options=new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
		Reporter.log("Exeuition started in class level");
		  //System.setProperty(chrome_key, chrome_value); 
		  driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.manage().window().maximize(); driver.get(url);
		 
		
	}

	@AfterSuite
	public void executionComplete() throws InterruptedException
	{
		System.out.println("execution ends......");
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
}