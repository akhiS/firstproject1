package day16;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class My_practice {

	FirefoxDriver driver;
	@BeforeMethod
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.yatra.com/");
	}
	@Test 
	public void calTest()
	{
		driver.findElement(By.xpath("//*[@id='BE_flight_form']/div[1]/span[1]/a/i")).click();
		driver.findElement(By.id("BE_flight_origin_city")).sendKeys("Hyderabad, India (HYD)");
		driver.findElement(By.id("BE_flight_arrival_city")).sendKeys("New Delhi, India (DEL)");
		driver.findElement(By.xpath("//*[@id='BE_flight_form']/div[2]/div[1]/ul/li[3]/i")).click();
		String doj="12/05/2016";
		String[] a=doj.split("/");
		String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};
		int x=Integer.parseInt(a[1]);
		String month=months[x-1];
		String day=a[0];
		String year=a[2];
		
		String calyear=driver.findElement(By.className("js_monthTitle")).getText();
		while(!calyear.equals(year))
		{
			driver.findElement(By.xpath("//*[@id='calmain']/div[3]/div[2]/a")).click();
			calyear=driver.findElement(By.className("js_monthTitle")).getText();
		}
		String calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		while(!calmonth.equals(month))
		{
			driver.findElement(By.xpath("//*[@id='calmain']/div[3]/div[2]/a")).click();
			calyear=driver.findElement(By.className("js_monthTitle")).getText();
		}
		WebElement table=driver.findElement(By.xpath("//*[@id='calmain']"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		boolean flag=false;
		for(int i=0;i<rows.size();i++)
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			for(int j=0;j<cols.size();j++)
			{
				if(cols.get(j).getText().equals(day))
				{
					cols.get(j).click();
					flag=true;
					break;
				}
			}
			if(flag==true)
			{
				break;
			}
	}
	}
}

