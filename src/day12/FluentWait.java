package day12;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FluentWait {
FirefoxDriver driver ;
    
    @BeforeMethod
    
    public void setup()
    
    {
        driver=new FirefoxDriver();
        driver.get("http://www.24hourfitness.com/not-yet-member.html");
        }
    @Test
    public void waitTest()
    {
    	org.openqa.selenium.support.ui.FluentWait<WebDriver> fwait =new org.openqa.selenium.support.ui.FluentWait<WebDriver>(driver).withTimeout(30,TimeUnit.SECONDS).pollingEvery(2,TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
    	fwait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("html/body/div[3]/div[2]/div/div[1]/div[1]/a")));
    	fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[3]/div[2]/div/div[1]/div[3]/a"))).click();
    	
    }
}
