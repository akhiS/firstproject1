package day8;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ScreenShot {

	public static void main(String[] args) throws IOException {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com/");
		File scrfile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(scrfile,new File("E:\\facebook.jpeg"));
		
		
		
		
	}

	}


