package day25;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParallelTesting {
	
	@DataProvider(parallel=true)
	public Object[][] exceldata() throws IOException 
	{
		FileInputStream f= new FileInputStream("C:\\book1.xlsx");
		XSSFWorkbook wb =new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("sheet1");
		Row r=ws.getRow(0);
		int rowcount=ws.getLastRowNum();
		int colcount=r.getLastCellNum();
		Object[][] data=new Object[rowcount][colcount];
		for(int i=0;i<rowcount;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				data[i][j]=ws.getRow(i).getCell(j).getStringCellValue();
				
			}
		}
		return data;
		
		
	}
	@Test(dataProvider="exceldata")
	public void loginTest(String u,String p,String b) throws MalformedURLException 
	{
		DesiredCapabilities cap=null;
		if(b.equals("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		else if(b.equals("chrome"))
		{
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.ANY);
		}
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		driver.get("http://yahoomail.com");
		driver.findElement(By.name("username")).sendKeys(u);
		driver.findElement(By.id("login-passwd")).sendKeys(p);
		driver.findElement(By.id("login-signin")).click();
	}

}
