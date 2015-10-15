package day12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Inputfields {

FirefoxDriver driver ;
    
    @BeforeMethod
    
    public void setup()
    
    {
        driver=new FirefoxDriver();
        driver.get("https://twitter.com/?lang=en");
        
        }
    @Test
    
    public void inputBotest()
    {
        String[] str ={"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve"};
        List<WebElement> myinput =driver.findElements(By.xpath("//input[@type='text' or @type='password']"));
        System.out.println(myinput.size());
        int j=0;
        for(int i=0; i<myinput.size();i++)
        {
            if (myinput.get(i).isDisplayed())
            {
            myinput.get(i).sendKeys(str[j]);
            j++;
            
            }
        }
        
        
    }
}

