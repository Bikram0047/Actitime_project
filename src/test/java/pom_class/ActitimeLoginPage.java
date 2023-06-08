package pom_class;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.AutoConstant;
import Generic.BasePage;
import Generic.ExcelLibrary;
import Generic.Helper;

public class ActitimeLoginPage extends BasePage implements AutoConstant
{
	public WebDriver driver;

	@FindBy(id = "username")
	private WebElement usernameTextfield;

	@FindBy(name = "pwd")
	private WebElement passwordTextfield;

	@FindBy(id = "loginButton")
	private WebElement loginButton;

	public ActitimeLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void loginMethod() throws IOException, InterruptedException
	{
		Helper.highlightelement(driver, usernameTextfield);
		usernameTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_logindata, 0, 1));
		//usernameTextfield.sendKeys("admin");
		Helper.highlightelement(driver,passwordTextfield);
		passwordTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_logindata, 1, 1));
		//passwordTextfield.sendKeys("manager");
		javascriptclick(driver, loginButton);
		Thread.sleep(5000);
		gettitle(driver, "Time-Track");
	}
}