package pom_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.AutoConstant;
import Generic.BasePage;
import Generic.Helper;

public class ActitimeHomePage extends BasePage implements AutoConstant
{
	public WebDriver driver;
	//intialization

	@FindBy(xpath="//div[@id='container_tasks']")
	private WebElement taskbutton;



	@FindBy(xpath="(//div[@class='popup_menu_icon'])[2]")
	private WebElement settingbutton;

	@FindBy(id="logoutLink")
	private WebElement logoutLink;

	@FindBy(xpath="//div[@id='container_users']")
	private WebElement userlink;	

	// declaration
	public ActitimeHomePage ( WebDriver driver)
	{this.driver= driver;
	PageFactory.initElements(driver, this);
	}

	//utilization


	public void logoutMethod() throws InterruptedException
	{
		Helper.highlightelement(driver, logoutLink);
		Thread.sleep(5000);
		logoutLink.click();
	}
	public void settingmethod() throws InterruptedException 
	{  
		Helper.highlightelement(driver, settingbutton);
		visibilityofelementlocated(driver, By.xpath("(//div[@class='popup_menu_icon'])[2]"));
		javascriptclick(driver, settingbutton);
		
	}
	public void tasksmethod() throws InterruptedException
	{
		Helper.highlightelement(driver, taskbutton);
		Thread.sleep(5000);
		javascriptclick(driver, taskbutton);
		
	} 
	public void userlinkmethod() throws Throwable
	{
		Helper.highlightelement(driver, userlink);
		userlink.click();
	}
}

