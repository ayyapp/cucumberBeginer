package utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class utilityMethods 
{
	 WebDriver driver;
	
	public static void scrollByWindow(WebDriver driver,int horizontal,int vertical)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy('"+horizontal+"','"+vertical+"')", "");
		
	}
	
	
	public static void waitFor(int i) throws Exception
	{
		Thread.sleep(i*1000);
	}

	public static void captureScreenshot(WebDriver driver,String screenshotNm)
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try
		{
			FileUtils.copyFile(src, new File("./ScreenSHots/'"+screenshotNm+"'.png"));
			
		}
		catch(Exception e)
		{
			System.out.println("Exception while taking screenshot "+e.getMessage());
		}
		
		
	}


}
