package day13;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Multiwindowtesting {
	 FirefoxDriver driver;
	    @BeforeMethod
	    
	    public void setuo()
	    {
	        
	        driver = new FirefoxDriver();
	        driver.get("http://bing.com");
	        }
	    @Test
	    public void Multiwindowstest()
	    {
	        driver.findElement(By.linkText("Help")).click();
	        Set<String> windowids=driver.getWindowHandles();
	        Iterator<String> it=windowids.iterator();
	        while (it.hasNext())
	        {
	            driver.switchTo().window(it.next());
	            try
	            {
	                driver.findElement(By.xpath("//*[@id='privacyLabel']"));
	                break;
	            }
	            catch(Exception e)
	            {
	                
	            }
	        }
	        }

}
