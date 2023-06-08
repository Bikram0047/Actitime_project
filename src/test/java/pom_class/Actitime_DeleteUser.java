package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitime_DeleteUser 
{
	//We can create same users multiple times same user in user creation page.
	public WebDriver driver;
	
	@FindBy(xpath = "//span[.='mohapatra, swastik']/../..//div[.='HR & Finance']")
	public WebElement nameclick;
	
	@FindBy(xpath = "//div[@class='deleteButton actionButton']")
	public WebElement deletebutton;
	
	
	public Actitime_DeleteUser(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void nameselect() throws InterruptedException
	{
		//How to iterate over multiple names created by the same user and put invocation count so
		//that it searces until it finds or loop where it matches if the name is stilll available and delete it?
		nameclick.click();
		Thread.sleep(5000);
	}
	public void deleteuser() throws InterruptedException
	{
		deletebutton.click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		 //automatic logout not happening
		
	}
}
