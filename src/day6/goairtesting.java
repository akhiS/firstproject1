package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class goairtesting {

	public static void main(String[] args) {
		
		ProfilesIni pr= new ProfilesIni();
		FirefoxProfile fp= pr.getProfile("MyProfile");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://goair.in");
		
		WebElement drop=driver.findElement(By.id("departureCitysearchBoxUserControlCriteriaBox"));
		WebElement drop1=driver.findElement(By.id("toCitysearchBoxUserControlCriteriaBox"));
		
		List<WebElement> DP =drop.findElements(By.tagName("option"));
		List<WebElement> DP1 =drop1.findElements(By.tagName("option"));
		
		System.out.println(DP.size());
		System.out.println(DP.size()-DP1.size());
		
		for(int i=0;i<DP.size();i++)
		{
			DP.get(i).click();
			
		if(DP.get(i).isSelected() && !DP.contains(DP1))
		
		{
			System.out.println(DP.get(i).getText()+ "is  present in FROM box");
			System.out.println(DP.get(i).getText()+ "is not present in TO box");
			
		}
		else
		{
			System.out.println("its presents in both to and form");
			
			
		}
		}
		
		
		

	}

}
