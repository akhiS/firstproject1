package day27;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginUsingLog4J {
	
	private static Logger log=Logger.getLogger(LoginUsingLog4J.class);

	public static void main(String[] args) {
	
		DOMConfigurator.configure("log4j.xml");
		FirefoxDriver driver = new FirefoxDriver();
		log.info("Browser launched");
		driver.get("http://yahoomail.com");
		log.info("opened yahoomail");
		driver.findElement(By.name("username")).sendKeys("akhi");
		log.info("entered username");
		driver.findElement(By.id("login-passwd")).sendKeys("1234");
		log.info("entered password");
		driver.findElement(By.id("login-signin")).click();
		log.info("clicked on login");

	}

}
