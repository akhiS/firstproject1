package day26;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Testcase1 {
	@Test
	
	
	public void POMTestcase()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyProfile");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		//page object creation in POM
		WelcomeMercuryTours wm=PageFactory.initElements
				               (driver,WelcomeMercuryTours.class);
		
		wm.FindAFlight("Admin","pass@123");
		driver.navigate().back();
		wm.menu.REGISTER();

		
	    
		
		
		
	}

}
