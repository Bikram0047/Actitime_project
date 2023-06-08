package Generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import pom_class.ActitimeLoginPage;


public class Basetest1_acti
{
	public WebDriver driver;
	@BeforeSuite
	public void executionstart() 
	{
		System.out.println("execution started for suite level");
	}
	@BeforeClass
	public void setup_chrom() 
	{
		System.out.println("execution started in class level");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
	}
	@BeforeMethod
	public void login_to_app() throws Throwable, Throwable
	{
		ActitimeLoginPage login = new ActitimeLoginPage(driver);
		login.loginMethod();
	}
	@AfterClass
	public void teardown()
	{
		System.out.println("execution ended in class level");
		driver.quit();
	}
	@AfterSuite
	public void completed() 
	{
		System.out.println("execution completed in suite level");
	}

}
