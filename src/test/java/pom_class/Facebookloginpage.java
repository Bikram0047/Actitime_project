package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.AutoConstant;
import Generic.BasePage;

public class Facebookloginpage extends BasePage implements AutoConstant
{
	public WebDriver driver;

	@FindBy (xpath= "//a[.='Create new account']")
	public WebElement newaccount;

	public Facebookloginpage  (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void NewaccountMethod() throws InterruptedException
	{    javascriptclick(driver, newaccount);
		 Thread.sleep(5000);
	}
}
