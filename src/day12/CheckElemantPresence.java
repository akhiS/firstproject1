package day12;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckElemantPresence {

FirefoxDriver driver ;
    
    @BeforeMethod
    
    public void setup()
    
    {
        driver=new FirefoxDriver();
        driver.get("http://google.com");
        }
    @Test
    public void elementPresencetest()
    {
    	String str=driver.getPageSource();
    	if(str.contains("rajinikant"))
    	{
    		System.out.println("yes");
    	}
    	else
    	{
    		System.out.println("no");
    	}
    }
}
