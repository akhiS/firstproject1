package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class HtmlUnitTesting {

	public static void main(String[] args) {
	
		HtmlUnitDriver driver= new HtmlUnitDriver(BrowserVersion.FIREFOX_38);
		
		driver.get("http://google.com");
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{
			if(links.get(i).isDisplayed())
			{
				System.out.println(links.get(i).getText());
				links.get(i).click();
				System.out.println(driver.getCurrentUrl());
				driver.navigate().back();
				links= driver.findElements(By.tagName("a"));
			}
		}
		

	}



		
		

	}


