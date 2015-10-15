package day9;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleScrrenShot {

	public static void main(String[] args) throws IOException {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		for (int i=0;i<links.size();i++)
		{
			if(links.get(i).isDisplayed());
			String linkname=links.get(i).getText();
			links.get(i).click();
			File scrfile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrfile,new File("F:\\piks\\"+linkname+".png"));
			driver.navigate().back();
			links=driver.findElements(By.tagName("a"));
			
		}
		
		
		
		
	}

}
