package pom_class;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage 
{
	
	
     @FindBy(name="q")
    private WebElement searchTextfield;	

     @FindBy(xpath="//span[contains(text(),'selenium')]")
    private List<WebElement> suggestion;

   public GoogleSearchPage(WebDriver driver)
   {
	PageFactory.initElements(driver, this);
    }
 
  public void searchtextfieldMethod()
  { 
	  searchTextfield.sendKeys("selenium");
  }
     public void selectsuggestionmethod() throws InterruptedException
    {
    	 Thread.sleep(5000);
  for(int i =0;i<suggestion.size();i++)
     {
	if(suggestion.get(i).getText().equalsIgnoreCase("selenium webdriver"))
	    {suggestion.get(i).click();
	      break;
	    }
     }
  
   }
}
