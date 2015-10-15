package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Goair1 {

	public static void main(String[] args) {
		ProfilesIni pr= new ProfilesIni();
		FirefoxProfile fp= pr.getProfile("MyProfile");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://goair.in");
		
		WebElement drop=driver.findElement(By.id("departureCitysearchBoxUserControlCriteriaBox"));
		List<WebElement> dropdown=drop.findElements(By.tagName("option"));
		
		for(int i=0;i<dropdown.size();i++)
		{
			dropdown.get(i).click();
			
			String city=dropdown.get(i).getText();
			
			WebElement todrop=driver.findElement(By.tagName("option"));
			
			if(todrop.getText().contains(city))
				
			{
				System.out.println(city+"is not working fine");
				
			}
			else
			{
				System.out.println(city+"is working fine");
			}
			
		}
	}

}
