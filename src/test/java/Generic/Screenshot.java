package Generic;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Screenshot implements ITestListener
{
	public void onTestFailure(ITestResult result) 
	{
		TakesScreenshot ts=(TakesScreenshot)BaseTest.driver;
		
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		//File destFile=new File("./Screenshot/failed.png");
		
		String methodName=result.getName();
		Calendar.getInstance().getTime();
		Date today=Calendar.getInstance().getTime();
		String name = today.toString().replace(":", "_");
		File destFile=new File("./Screenshot" +methodName+name+ ".png");
				
		try {
			FileHandler.copy(srcFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}