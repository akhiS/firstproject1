package day12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CapturingImagelinks {
	
FirefoxDriver driver ;
    
    @BeforeMethod
    
    public void setup()
    
    {
        driver=new FirefoxDriver();
        driver.get("http://www.24hourfitness.com/not-yet-member.html");
        }
    @Test
    public void imageandlinks()
    {
    	List<WebElement>  elements= driver.findElements(By.tagName("a")) ;
    	System.out.println(elements.size());
    	elements.addAll(driver.findElements(By.tagName("img")));
    	System.out.println(elements.size());
    }

}
