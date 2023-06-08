package testclass;

import org.testng.annotations.Test;

import Generic.BasePage;
import pom_class.ActitimeHomePage;
import pom_class.ActitimeLoginPage;
import pom_class.ActitimeSettingPage;
import pom_class.ActitimeTypeOfWorkPage;

public class ActitimeDeleteTypeOfWork extends BasePage 
{
	@Test (groups= "regression")

	public void Actitimedeletetypeofwork() throws Exception
	{
		/*
		 * System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 * WebDriver driver = new ChromeDriver();
		 * driver.get("https:/demo.actitime.com"); driver.manage().window().maximize();
		 */

		ActitimeLoginPage loginpage= new ActitimeLoginPage(driver);
		loginpage.loginMethod();
		
		ActitimeHomePage homepageopen = new ActitimeHomePage(driver);
		homepageopen.settingmethod();
		
		ActitimeSettingPage settingpage = new ActitimeSettingPage(driver);
		settingpage.typesofwork();
		
		ActitimeTypeOfWorkPage typeofwork= new ActitimeTypeOfWorkPage(driver);
	    typeofwork.DeletenameMethod();
	   
	    
	    
	    homepageopen.logoutMethod();
	    //driver.quit();
		
		
		
	}
}
