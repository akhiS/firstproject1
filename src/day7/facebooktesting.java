package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class facebooktesting {

	public static void main(String[] args) {
		
		ProfilesIni pr= new ProfilesIni();
		FirefoxProfile fp= pr.getProfile("MyProfile");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://facebook.com");
		
		driver.findElement(By.id("u_0_1")).sendKeys("Akhi");
		driver.findElement(By.id("u_0_3")).sendKeys("singh");
		driver.findElement(By.id("u_0_5")).sendKeys("singhakhilesh477@gmail.com");
		driver.findElement(By.id("u_0_8")).sendKeys("singhakhilesh477@gmail.com");
		driver.findElement(By.id("u_0_a")).sendKeys("123456");
		
		
		driver.findElement(By.id("day")).sendKeys("13");
		driver.findElement(By.id("month")).sendKeys("may");
		driver.findElement(By.id("year")).sendKeys("1988");
		
		driver.findElement(By.id("u_0_e")).click();
		driver.findElement(By.id("u_0_i")).click();
		driver.findElement(By.id("u_0_i")).click();

	}

}
