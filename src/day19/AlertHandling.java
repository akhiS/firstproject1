package day19;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.AlertHandler;
import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class AlertHandling {
	
FirefoxDriver driver;
	
	@BeforeMethod
	
	
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://google.com");
		
	}
	@Test
	public void dropdownTest() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('hello world')");
		Thread.sleep(5000);
		AlertHandler();
		}
	public void AlertHandler()
	{
		try
		{
			Alert alert=driver.switchTo().alert();
					alert.accept();
		}
		catch(Exception e)
		{
			
		}
	}

}
