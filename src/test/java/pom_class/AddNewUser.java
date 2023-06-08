package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewUser 
{
	public WebDriver driver;
	@FindBy(xpath="//input[@id='createUserPanel_firstNameField']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@id='createUserPanel_lastNameField']")
	private WebElement lastname;

	@FindBy(xpath="//input[@id='createUserPanel_emailField']")
	private WebElement emailname;
	
	@FindBy(xpath="(//div[@class='downIcon'])[5]")
	private WebElement downicon;
	
	@FindBy(xpath="(//div[.='HR & Finance'])[3]")
	private WebElement hrfinancebutton;
	
	@FindBy(xpath="//div[@class='components_switcher small off animated']")
	private WebElement timetrackicon;
	

	@FindBy(xpath="//div[.='Save & Send Invitation']")
	private WebElement savebuttton;
	
	@FindBy(xpath="(//span[.='Close'])[1]")
	private WebElement closebuttton;


	public AddNewUser( WebDriver driver)
	{
		this.driver= driver;
	PageFactory.initElements(driver, this);
	}

		
	public void firstnamemethod()
	{
	  firstname.sendKeys("swastik");
	}	
	public void lastnamemethod() throws InterruptedException
	{
	  lastname.sendKeys("mohapatra");
	  Thread.sleep(3000);
	}	
	public void emailnamemethod() throws InterruptedException
	{
	  emailname.sendKeys("swastik.mohapatra12@gmail.com");
	  Thread.sleep(3000);
	}	
	public void downiconmethod() throws InterruptedException
	{
	  downicon.click();
	  Thread.sleep(2000);
	}
	public void hrfinancemethod() throws InterruptedException
	{
	hrfinancebutton.click();
	Thread.sleep(2000);
	}	
	public void timetrackmethod()
	{
	timetrackicon.click();
	}	
	public void savemethod() throws InterruptedException
	{
	savebuttton.click();
	Thread.sleep(5000);
	}
	public void closemethod() throws InterruptedException
	{
	closebuttton.click();
	Thread.sleep(5000);
	//driver.switchTo().alert().accept();
	}	
}
