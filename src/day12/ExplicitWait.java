package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWait {
	
FirefoxDriver driver ;
    
    @BeforeMethod
    
    public void setup()
    
    {
        driver=new FirefoxDriver();
        driver.get("http://www.24hourfitness.com/not-yet-member.html");
        }
    @Test
    public void waittest()
    {
    	WebDriverWait mywait= new WebDriverWait(driver, 30);
    	mywait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("html/body/div[3]/div[2]/div/div[1]/div[1]/a")));
   mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[3]/div[2]/div/div[1]/div[3]/a"))).click();
    	
    	
    }

    }


