package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RightClick {

FirefoxDriver driver;
	
	@BeforeMethod
	
	public void setup()
	{
		driver =new FirefoxDriver();
		driver.get("http://google.com");
	}
	@Test
	public void rightClicktest()
	{
		Actions action =new Actions(driver);
		WebElement event = driver.findElement(By.linkText("Gmail"));
		action.contextClick(event).sendKeys("L").sendKeys(Keys.ENTER).build().perform();
		//(command to ipnut from keyboard)action.contextClick(event).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}
}
