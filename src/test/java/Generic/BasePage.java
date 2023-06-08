package Generic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage extends BaseTest
{
	//Select Class
	public void selectbyvisibletext(WebElement element , String text)
	{
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
	
	public void selectbyindex(WebElement element , int index)
	{
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	
	//Navigation Interface
	public void moveback(WebDriver driver)
	{
		driver.navigate().back();
	}
	
	//Options Interface
	public void getallcookies(WebDriver driver)
	{
		Set<Cookie> allCookies=driver.manage().getCookies();
		Reporter.log("all cookies are" + allCookies);
	}
	
	//Actions Class
	public void movetoelement(WebDriver driver , WebElement element)
	{
		Actions actions=new Actions(driver);
		actions.moveToElement(element).perform();
	}
	
	//Robot Class
	public void robottab() throws AWTException
	{
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
	}
	
	//Alert Interface
	public void alertaccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	public void alertenter(WebDriver driver , String text)
	{
		driver.switchTo().alert().sendKeys(text);
	}
	
	//JavascriptExecutor Interface
	public void javascriptclick(WebDriver driver , WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
	}
	
	//WebDriver Interface
	public void gettitle(WebDriver driver , String text)
	{
		String actualTitle=driver.getTitle();
		if(actualTitle.contains(text))
		{
			System.out.println("titles are matching");
		}
		else
		{
			System.out.println("titles are not matching");
		}
	}
	
	public void getcurrenturl(WebDriver driver , String expectedUrl)
	{
		String actualUrl=driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
		
	}
	
	//WebDriverWait Class
	public void visibilityofelementlocated(WebDriver driver , By locator)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public void titleis(WebDriver driver , String title)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleIs(title));
	}
}