package firstproject;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Profile {

	public static void main(String[] args) {
	     
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=new FirefoxProfile();
		
		fp=pr.getProfile("MyProfile");
		
		FirefoxDriver driver = new FirefoxDriver(fp);
		driver.get("http://msn.com");

	}

}
