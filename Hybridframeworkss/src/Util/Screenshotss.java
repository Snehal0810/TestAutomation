package Util;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import Com.Generic.Maingenric;

public class Screenshotss extends Maingenric
{
	  @Test
	  public static  void pics(WebDriver driver) throws IOException
	  {
			String photo="./Photo/";
				Date d=new Date();
				String d1=d.toString();
				String d2=d1.replaceAll(":", "-");
				TakesScreenshot ts=(TakesScreenshot)driver;
				File src = ts.getScreenshotAs(OutputType.FILE);
				File dst=new File(photo+d2+"hybid.jpeg");
				FileHandler.copy(src, dst);

	  }

}
