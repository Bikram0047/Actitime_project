package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.AutoConstant;
import Generic.BasePage;
import Generic.Helper;

public class ActitimeSettingPage extends BasePage implements AutoConstant

	{
	public WebDriver driver;
	//declaration
		@FindBy(xpath="//div[.='Turn Features On / Off']")
		private WebElement turnfeaturelink;
		

		@FindBy(xpath="(//div[@class='item_title'])[3]")
		private WebElement generalsettinglink;
		

		@FindBy(xpath="//a[.='Workflow Settings']")
		private WebElement workflowsettinglink;
		

		@FindBy(xpath="//a[.='Types of Work']")
		private WebElement typesofworklink;
		

		@FindBy(xpath="//a[.='Leave Types']")
		private WebElement leavetypelink;
		
		@FindBy(xpath="//a[.='Notifications']")
		private WebElement notificationlink;

		@FindBy(xpath="//a[.='Logo Settings']")
		private WebElement logosettinglink;
		
		
		@FindBy(xpath="//div[.='Licenses']")
		private WebElement licenselink;
		
	
		//intialization
		public ActitimeSettingPage ( WebDriver driver)
		
		{    this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		
		//utilization
		public void turnfeature() throws Throwable
		{
			Thread.sleep(5000);
			Helper.highlightelement(driver, turnfeaturelink);
			turnfeaturelink.click();	
		}
		public void workflowsetting() throws Throwable
		{
			Thread.sleep(5000);
			Helper.highlightelement(driver, workflowsettinglink);
			workflowsettinglink.click();
		}
		public void typesofwork() throws InterruptedException
		{
			Helper.highlightelement(driver, typesofworklink);
		 javascriptclick(driver, typesofworklink);
		 Thread.sleep(4000);
		}
		public void leavetype() throws Throwable
		{
			Thread.sleep(5000);
			Helper.highlightelement(driver, leavetypelink);
			leavetypelink.click();
		}
		public void notifications() throws Throwable
		{
			Thread.sleep(5000);
			Helper.highlightelement(driver, notificationlink);
			notificationlink.click();
		}
		public void logosetting() throws Throwable
		{
			Thread.sleep(5000);
			Helper.highlightelement(driver, logosettinglink);
			logosettinglink.click();
		}
		public void license() throws Throwable
		{
			Thread.sleep(5000);
			Helper.highlightelement(driver, licenselink);
			licenselink.click();
		}
		
		
		
	}


