package day26;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomeMercuryTours {
	
	public Menu menu = null;
	public WelcomeMercuryTours(WebDriver driver)
	{
		menu=PageFactory.initElements(driver,Menu.class);
		
	}
	@FindBy(name="userName")
	WebElement userName;
	@FindBy(name="password")
	WebElement password;
	@FindBy(name="login")
	WebElement login;
	
	public void FindAFlight(String u,String p)
	{
		userName.sendKeys(u);
		password.sendKeys(p);
		login.click();
	}
	@FindBy(linkText="Register here")
	WebElement Register;
	public void Register()
	{
		Register.click();
	}
	
	

}
