package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLeaveTypePage 

{
	@FindBy(xpath="(//div[.='Create Leave Type'])[2]")
	private WebElement createleavetypebutton;
	
	public ActitimeLeaveTypePage ( WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createleavetypeMethod()
	{
		createleavetypebutton.click();
	}

	
	
}
