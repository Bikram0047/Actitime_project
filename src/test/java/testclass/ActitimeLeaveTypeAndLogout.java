package testclass;

import org.testng.annotations.Test;

import Generic.BasePage;
import pom_class.ActitimeCreateNewLeaveType;
import pom_class.ActitimeHomePage;
import pom_class.ActitimeLeaveTypePage;
import pom_class.ActitimeLoginPage;
import pom_class.ActitimeSettingPage;

public class ActitimeLeaveTypeAndLogout extends BasePage
{

	@Test(groups={"smoke","regression"})
	public void leaveapplay() throws Throwable
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
			settingpage.leavetype();
			
			ActitimeLeaveTypePage leavetype = new ActitimeLeaveTypePage(driver);
			leavetype.createleavetypeMethod();
			
			ActitimeCreateNewLeaveType newleavetype = new ActitimeCreateNewLeaveType(driver);
			newleavetype.createnewleavetypeMethod();
			newleavetype.secondcreateleavemethod();
			
			homepageopen.logoutMethod();
			
	}
}
	
