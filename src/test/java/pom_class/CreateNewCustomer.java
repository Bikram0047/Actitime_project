package pom_class;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import Generic.AutoConstant;
import Generic.BasePage;
import Generic.ExcelLibrary;
import Generic.Helper;

public class CreateNewCustomer extends BasePage implements AutoConstant
{    
	public WebDriver driver;
@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
private WebElement customertextfield;

@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
private WebElement customerdescriptiontextfield;

@FindBy(xpath="//div[.='Create Customer']")
private WebElement createcustomerlink;

@FindBy(xpath="//div[@class='greyButton cancelBtn']")
private WebElement cancellink;

@FindBy(xpath="(//div[.='Bikram keshari sahoo'])[1]/../..//div[@class='editButton']")
private WebElement settingsbutton;

@FindBy(xpath="//div[.='Customer with the specified name already exists']")
private WebElement errormessage;

public CreateNewCustomer ( WebDriver driver)

{   
	this.driver= driver;
	PageFactory.initElements(driver, this);
	
}

public void customertextfieldMethod() throws IOException
 {
    customertextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_createcustomer, 0, 0));
 }
public void customerdescriptiontextfieldMethod() throws IOException, Throwable
{
	Helper.highlightelement(driver, customerdescriptiontextfield);
	customerdescriptiontextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_createcustomer, 0, 0));
}
public void createcustomerMethod() throws InterruptedException
{
	Helper.highlightelement(driver, createcustomerlink);
   javascriptclick(driver,createcustomerlink );
}
public void cancellinkMethod() throws Throwable
{
	Helper.highlightelement(driver, cancellink);
	cancellink.click();
}
public void alertMethod()
{
	driver.switchTo().alert().accept();
}
public void settingsMethod() throws InterruptedException
{  
	Helper.highlightelement(driver, settingsbutton);
	settingsbutton.click();
	
} 	
public void verifyerrormessage() throws InterruptedException
{
	Thread.sleep(2000);
	String actualErrorMessage = errormessage.getText();	
	SoftAssert s=new SoftAssert();
	s.assertEquals(actualErrorMessage,"Customer with the specified name already exists");
	s.assertAll();
 } 	
}