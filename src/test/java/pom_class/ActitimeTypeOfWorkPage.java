package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.AutoConstant;
import Generic.BasePage;

public class ActitimeTypeOfWorkPage extends BasePage implements AutoConstant
{   //declaration
	
	public WebDriver driver;
	@FindBy(xpath="(//input[@name='statusCriterionAsString'])[1]")
	private WebElement statuslink;
	
	@FindBy(xpath="(//input[@name='billableCriterionAsString'])[1]")
	private WebElement catagorylink;
	

	@FindBy(xpath="//input[@value='Show Types of Work']")
	private WebElement showtypesofworklink;
	

	@FindBy(xpath="//span[.='Create Type of Work']")
	private WebElement createtypesofwork;
	
	@FindBy(xpath="(//div[@class='editButton'])[18]")
	private WebElement deletesettingsbutton;
	
	@FindBy(xpath="//a[contains(text(),'Bikram')]/../..//a[contains(text(),'delete')]")
	private WebElement deletelink;
	
	
	//intialization(access the webdriver)
	
	public ActitimeTypeOfWorkPage(WebDriver driver)
	{   
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

//utilization(we create a method of each and every stages)
public void statusMethod()
{
	
	statuslink.click();
}
public void catagoryMethod()
{
	catagorylink.click();
}
public void showTypeOfWorkMethod()
{
	showtypesofworklink.click();
}
public void createTypeOfWork() throws InterruptedException
{
	javascriptclick(driver, createtypesofwork);
	Thread.sleep(5000);
}
public void deletesettingsMethod()
{
	deletesettingsbutton.click();
}
public void DeletenameMethod() throws InterruptedException
{
	Thread.sleep(5000);
	javascriptclick(driver,deletelink);
	Thread.sleep(5000);
	alertaccept(driver);
	
}


}