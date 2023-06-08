package pom_class;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewTaskPage 
{   
	public WebDriver driver;
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addnewtask;
	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement createnewcustomer;
	
	public AddNewTaskPage  ( WebDriver driver)
	
	{   this.driver=driver;
		PageFactory.initElements(driver, this);
	}	
	
	public void addnewtaskmethod() throws InterruptedException
	
    {
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click()",addnewtask);
    
    	Thread.sleep(5000);
    }
	public void createnewcustomerMethod() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click()",createnewcustomer);
		
		Thread.sleep(5000);
	}
}