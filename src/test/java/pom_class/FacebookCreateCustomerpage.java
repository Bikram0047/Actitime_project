package pom_class;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.AutoConstant;
import Generic.BasePage;
import Generic.ExcelLibrary;


public class FacebookCreateCustomerpage extends BasePage implements AutoConstant
{	
	public WebDriver driver;
	
	@FindBy (xpath= "//input[@name='firstname']")
	public WebElement firstname;
	
	@FindBy (xpath= "//input[@name='lastname']")
	public WebElement lastname;
	
	@FindBy (xpath= "//input[@name='reg_email__']")
	public WebElement mobileno;
	
	@FindBy (xpath= "//input[@data-type='password']")
	public WebElement password;
	
	@FindBy(id = "day")
	private WebElement dayDropdownlist;
	
	@FindBy(id = "month")
	private WebElement monthDropdownlist;
	
	@FindBy(id = "year")
	private WebElement yearropdownlist;
	
	@FindBy(xpath = "//img[@class='_8idr img']")
	private WebElement closeLink;
	
	@FindBy(xpath="//label[.='Male']")
	private WebElement malelink;
	
	
	public FacebookCreateCustomerpage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}	
	
	public void FirstnameMethod() throws IOException, InterruptedException
	{
		Thread.sleep(4000);
		 firstname.sendKeys(ExcelLibrary.getcellvalue(sheet_name4, 1, 0));
		 
	}
	public void LastnameMethod() throws IOException, InterruptedException
	{   Thread.sleep(4000);
		lastname.sendKeys(ExcelLibrary.getcellvalue(sheet_name4, 1, 1)); 
		
	}
	public void MobilenoMethod() throws InterruptedException, IOException
	{   Thread.sleep(3000);
		mobileno.sendKeys(ExcelLibrary.getcellvalue(sheet_name4, 1, 2));
		
	}
	public void PasswordMethod() throws IOException, InterruptedException
	{   Thread.sleep(3000);
		password.sendKeys(ExcelLibrary.getcellvalue(sheet_name4, 1, 3));
		
	}	
	public void dateofbirth()
	{
		selectbyvisibletext(dayDropdownlist, "30");
		selectbyvisibletext(monthDropdownlist, "Nov");
		selectbyvisibletext(yearropdownlist, "1997");
	}
	public void CloseMethod()
	{
		javascriptclick(driver, closeLink);
	
	}	
	public void malemethod()
	{
		javascriptclick(driver, malelink);
	}
  }