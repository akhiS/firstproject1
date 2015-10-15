package day21;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadAutoIT {

	public static void main(String[] args) throws Exception {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://imgur.com/");
		driver.findElement(By.className("upload-btn-text")).click();
		driver.findElement(By.id("upload-global-file")).click();
		Thread.sleep(3000);
		java.lang.Runtime.getRuntime().exec("F:\\seleinum\\seleniumhqUpload.exe");
		

	}

}
