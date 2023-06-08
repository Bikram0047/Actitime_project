package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListOfUserPage
{
@FindBy(xpath="//div[.='New User']")
private WebElement addnewuser;


public ListOfUserPage( WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

	
public void listofnewuser() throws InterruptedException
{
  addnewuser.click();
  Thread.sleep(3000);
}	
	
	
}
