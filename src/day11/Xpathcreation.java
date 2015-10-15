package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Xpathcreation {

	FirefoxDriver driver;
	@BeforeMethod 
	public void setup()
	{
		driver= new FirefoxDriver();
		driver.get("http://www.eenadu.net/hyderabad-news.aspx");
	}
	@Test
	public void xpathTest()
	{
		driver.findElement(By.xpath("//a[@href='hyderabad-news-inner.aspx?item=break183']")).click();
	}
}
