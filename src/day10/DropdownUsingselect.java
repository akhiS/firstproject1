package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropdownUsingselect {
	
	FirefoxDriver driver;
	@BeforeMethod
	
	public void setup(){
		
		ProfilesIni pr= new ProfilesIni();
		FirefoxProfile fp= pr.getProfile("MyProfile");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://amazon.in");
	}
	@Test
	public void dropdownTest()
	{
	WebElement drop=driver.findElement(By.id("searchDropdownBox"));
	
	Select sel=new Select(drop);
	sel.selectByVisibleText("baby");
	sel.selectByValue("search-alias=baby");
	sel.selectByIndex(1);
	
	}
    @AfterMethod
    
    public void teardown()
    {
    	driver.close();
    }
}
