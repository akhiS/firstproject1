package firstproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Sbitesting {

	public static void main(String[] args) {
		
		
		ProfilesIni pr= new ProfilesIni();
		FirefoxProfile fp= pr.getProfile("MyProfile");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("https://www.sbi.co.in/");
		WebElement block = driver.findElement(By.xpath(".//*[@id='footer']/div[1]"));
		List<WebElement> links = block.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
			links.get(i).click();
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
			block = driver.findElement(By.xpath(".//*[@id='footer']/div[1]"));
			links = block.findElements(By.tagName("a"));
			
		}

	}

}
