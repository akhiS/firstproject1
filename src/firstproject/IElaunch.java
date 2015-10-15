package firstproject;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IElaunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver","c:\\IEdriverserver.exe");
		
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("http://google.com");

	}

}
