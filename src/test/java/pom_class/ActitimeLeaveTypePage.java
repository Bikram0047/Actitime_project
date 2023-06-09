package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.BasePage;

public class ActitimeLeaveTypePage  extends BasePage

{
	@FindBy(xpath="(//div[.='Create Leave Type'])[2]")
	private WebElement createleavetypebutton;
	@FindBy(xpath = "//span[contains(text(),'causal')]/../../../../../..//td[@class='leaveTypeDeleteCell last']")
	private WebElement deleteleavetypebutton;
	
	public ActitimeLeaveTypePage ( WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createleavetypeMethod()
	{
		createleavetypebutton.click();
	}
	public void deleteleavetypemethod() 
	{
		
		deleteleavetypebutton.click();
	}

	
	
}
