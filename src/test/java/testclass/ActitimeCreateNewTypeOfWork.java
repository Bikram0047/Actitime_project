package testclass;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic.BaseTest;
import pom_class.ActitimeHomePage;
import pom_class.ActitimeLoginPage;
import pom_class.ActitimeSettingPage;
import pom_class.ActitimeTypeOfWorkPage;
import pom_class.CreateNewTypeOfWorkPage;
@Listeners(Generic.Screenshot.class)
public class ActitimeCreateNewTypeOfWork extends BaseTest
{
	@Test (groups="smoke")

	public void Actitimecreatenewtypeofwork() throws Exception
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
		typeofwork.createTypeOfWork();
		
		
		CreateNewTypeOfWorkPage nameentry = new CreateNewTypeOfWorkPage(driver);
		nameentry.nameMethod();
	    nameentry.createtypeofworkmethod();
	    
	    homepageopen.logoutMethod();
	    //driver.quit();

	}
	
}