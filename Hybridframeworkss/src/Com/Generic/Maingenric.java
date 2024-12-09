package Com.Generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Util.Screenshotss;

public class Maingenric 
{
	public WebDriver driver;
	@BeforeMethod
	public void Openapp()
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
	    driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}
	@AfterMethod
	public void closeapp() throws IOException 
	{
		 Util.Screenshotss.pics(driver);
		driver.close();
	}
}
