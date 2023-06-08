package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TypeOfWorkPage 
{
	@FindBy(xpath="//a[contains(text(),'Bikram')]/../..//a[contains(text(),'delete')]")
	private WebElement deletelink;
	
	

	
	 public  TypeOfWorkPage  ( WebDriver driver)
		
		{
			PageFactory.initElements(driver, this);
		}
	 
	 public void deleteMethod() throws Exception
		{   Thread.sleep(7000);
			deletelink.click();
		}
	
	 
	 
}