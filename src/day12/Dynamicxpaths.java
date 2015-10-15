package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dynamicxpaths {

FirefoxDriver driver ;
    
    @BeforeMethod
    
    public void setup()
    
    {
        driver=new FirefoxDriver();
        driver.get("http://yahoo.com");
        
        }
    @Test
    public void xpathtest()
    {
    	driver.findElement(By.xpath("//*[Start-with(@id,'yui_3_12_0_1_144317')]/div/ol/li[6]/a")).click();
    	
    }
    
}
