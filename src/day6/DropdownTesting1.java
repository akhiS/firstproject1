package day6;



import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class DropdownTesting1 {

	public static void main(String[] args) {
		
		ProfilesIni pr= new ProfilesIni();
		FirefoxProfile fp= pr.getProfile("MyProfile");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://www.amazon.in/");
		
		
		driver.findElement(By.id("searchDropdownBox")).sendKeys("Electronics");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("moto g");
		driver.findElement(By.className("nav-input")).click();

	}

}
