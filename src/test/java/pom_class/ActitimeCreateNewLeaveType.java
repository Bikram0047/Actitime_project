package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeCreateNewLeaveType 
{
	@FindBy(xpath="//input[@id='leaveTypeLightBox_nameField']")
	private WebElement createnewleavetype;
	
	@FindBy(xpath="(//span[contains(text(),'Create Leave Type')])[2]")
	private WebElement secondcreatenewleave;
	
	public ActitimeCreateNewLeaveType  ( WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createnewleavetypeMethod()
	{
		createnewleavetype.sendKeys("causal");;
	}
	public void secondcreateleavemethod()
	{
		secondcreatenewleave.click();
	}
}
