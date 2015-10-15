package firstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linkTesting1 {

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.findElement(By.linkText("Gmail")).click();
			String exptitile="Gmail";
			String acttitle=driver.getTitle();
			
			if(exptitile.equals(acttitle))
			{
				System.out.println("Gmail working fine");
				
			}
			else
				
			{
				System.out.println("Gmail not working fine");
			}
			
			driver.close();
			
			
			

	}

}
