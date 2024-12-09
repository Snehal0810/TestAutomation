package Com.Runnersript;


import org.testng.annotations.Test;

import Com.Generic.Maingenric;
import Com.Pomscript.Facebklog;

public class Fbrunnrscript extends Maingenric
{
	@Test
	public void runmeth()
	{
		Facebklog fb=new Facebklog(driver);
		fb.passuname("abc");
		fb.passpwd("123");
		fb.logbtn();
		
	}

}
