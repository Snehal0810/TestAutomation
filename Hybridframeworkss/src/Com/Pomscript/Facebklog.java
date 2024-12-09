package Com.Pomscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebklog
{
	@FindBy(id="email")
	private WebElement Usrname;
	@FindBy(id="pass")
	private WebElement password;
	@FindBy(name="login")
	private WebElement btnsignup;
	
	public Facebklog(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void passuname(String un)
	{
		Usrname.sendKeys(un);
	}
	public void passpwd(String pw)
	{
		password.sendKeys(pw);
	}
	public void logbtn()
	{
		btnsignup.click();
	}

}
