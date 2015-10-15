package day21;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.opera.core.systems.internal.input.KeyEvent;

public class FileDownLoadRobot {

	public static void main(String[] args) throws Exception {


		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://docs.seleniumhq.org/");
		driver.findElement(By.linkText("Download")).click();
		driver.findElement(By.linkText("2.47.1")).click();
		Thread.sleep(3000);
		Robot rb=new Robot();
		Thread.sleep(5000);
		rb.keyPress(java.awt.event.KeyEvent.VK_TAB);
		rb.keyRelease(java.awt.event.KeyEvent.VK_TAB);
		rb.keyPress(java.awt.event.KeyEvent.VK_ENTER);
		rb.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
		
				

	}

}
