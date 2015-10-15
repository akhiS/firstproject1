package firstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class yahoologin {

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://yahoomail.com");
		driver.findElement(By.id("login-username")).sendKeys("god198854");
		driver.findElement(By.id("login-passwd")).sendKeys("alkaamrish");
		driver.findElement(By.id("login-signin")).click();
		driver.findElement(By.id("login-signin")).click();
		driver.findElement(By.id("login-signin")).click();
		
		driver.findElement(By.partialLinkText("Sent")).click();

	}

}
