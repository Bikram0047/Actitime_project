package testclass;

import java.io.IOException;
import org.testng.annotations.Test;

import Generic.BasePage;
import Generic.BaseTest;
import pom_class.ActitimeHomePage;
import pom_class.ActitimeLoginPage;

public class ActitimeLoginLogout extends BasePage
{
	@Test
	public void loginlogout() throws IOException, InterruptedException
	{
		ActitimeLoginPage loginPage=new ActitimeLoginPage(driver);
		loginPage.loginMethod();
		ActitimeHomePage home = new ActitimeHomePage(driver);
		home.logoutMethod();
	}
} 