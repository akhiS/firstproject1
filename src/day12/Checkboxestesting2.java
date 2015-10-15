package day12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Checkboxestesting2 {

FirefoxDriver driver ;
    
    @BeforeMethod
	 public void setup()
	    
	    {
	        driver=new FirefoxDriver();
	        driver.get("http://www.echoecho.com/htmlforms09.htm");
	        }
	    @Test
	    public void checkboxtest()
	    {
	    List<WebElement> check =driver.findElements(By.xpath("//td[@class='tables5']/input[@type='checkbox']"));
	    for(int i=0;i<check.size();i++)
	    {
	    	if(!check.get(i).isSelected())
	    	{
	    		check.get(i).click();
	    	}
	    }
}
}
