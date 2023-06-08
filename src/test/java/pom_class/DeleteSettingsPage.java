package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Helper;

public class DeleteSettingsPage 
{
	public WebDriver driver;
	@FindBy(xpath="(//div[@class='actionButton'])[7]")
	private WebElement deleteactionButton;


	@FindBy(xpath="(//div[.='Delete'])[2]")
	private WebElement deletebutton;

	@FindBy(xpath="//span[.='Delete permanently']")
	private WebElement deletepermanently;

	public  DeleteSettingsPage   ( WebDriver driver)

	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void settingActionMethod() throws InterruptedException
	{
		Helper.highlightelement(driver, deleteactionButton);
		Thread.sleep(3000);
		deleteactionButton.click();
	}

	public void deleteMethod() throws InterruptedException
	{
		Helper.highlightelement(driver, deletebutton);
		Thread.sleep(3000);
		deletebutton.click();
	}
	public void deletepermanentelyMethod() throws InterruptedException
	{
		Helper.highlightelement(driver, deletepermanently);
		Thread.sleep(3000);
		deletepermanently.click();
	}

}
