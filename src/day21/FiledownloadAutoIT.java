package day21;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FiledownloadAutoIT {

	public static void main(String[] args) throws Exception {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://docs.seleniumhq.org/");
		driver.findElement(By.linkText("Download")).click();
		driver.findElement(By.linkText("2.47.1")).click();
		Thread.sleep(3000);
		java.lang.Runtime.getRuntime().exec("f:\\seleniumhq.exe");
		
		

	}

}
