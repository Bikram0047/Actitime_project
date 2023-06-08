package testclass;

import java.io.IOException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Generic.BaseTest;
import pom_class.ActitimeHomePage;
import pom_class.ActitimeLoginPage;
import pom_class.ActitimeSettingPage;
import pom_class.ActitimeTypeOfWorkPage;
import pom_class.CreateNewTypeOfWorkPage;

//@Listeners(Generic.Screenshot.class)
public class ActitimeTypeOfWork extends BaseTest
{
	@Test
	public void ActitimeCreateTypeOfWork() throws InterruptedException, IOException
	{
		ActitimeLoginPage loginPage=new ActitimeLoginPage(driver);
		loginPage.loginMethod();

		ActitimeHomePage home =  new ActitimeHomePage(driver);
		home.settingmethod();

		ActitimeSettingPage setting = new ActitimeSettingPage(driver);
		setting.typesofwork();

		ActitimeTypeOfWorkPage work = new ActitimeTypeOfWorkPage(driver);
		work.createTypeOfWork();

		CreateNewTypeOfWorkPage create = new CreateNewTypeOfWorkPage(driver);
		create.nameMethod();
		create.createtypeofworkmethod();

	}
}
