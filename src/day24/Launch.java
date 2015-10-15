package day24;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Launch {
	
	FirefoxDriver driver;
	@BeforeClass
	public void launchApp(){
		
		driver = new FirefoxDriver();
				driver.get("http://newtours.demoaut.com/");
	}
	
	@AfterClass
	public void closeApp()
	{
		driver.quit();
	}

}
