package day19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DatadrivenTesting5 {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("https://care.ideacellular.com/wps/portal/account/express-paybill?gclid=CObarP-p3McCFVYMjgod0Y0Kgw#Z7_JH56H4K0K8MP90AS8PIGS60CN3?iFrameAction=com.idea.selfcare.action.UrlRedirectAction");
	}
	
	@Test
	public void linkTest() throws IOException
	{
		FileInputStream f=new FileInputStream("F:\\seleinum\\firstproject\\src\\com\\qedge\\excelfiles\\Ajaxdata.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Iterator<Row> row=ws.iterator();
		row.next();
		while(row.hasNext())
		{
			Row r=row.next();
			String phno=r.getCell(0).getStringCellValue();
			driver.findElement(By.name("mobileNumber")).clear();
			driver.findElement(By.name("mobileNumber")).sendKeys(phno);
			driver.findElement(By.name("amountPaid")).click();
			WebElement ajax=driver.findElement(By.xpath("//*[@id='errorHolder']/label"));
			String actajax=null;
			if(ajax.getText().isEmpty())
			{
				actajax="No Ajax";
			}
			else
			{
				actajax=ajax.getText();
			}
			r.createCell(2).setCellValue(actajax);
			String expajax=r.getCell(1).getStringCellValue();
			if(expajax.equals(actajax))
			{
				r.createCell(3).setCellValue("Passed");
			}
			else
			{
				r.createCell(3).setCellValue("Failed");
			}
		}
		FileOutputStream f1=new FileOutputStream("F:\\seleinum\\firstproject\\src\\com\\qedge\\resultexcelfiles\\ajaxresult.xlsx");
		wb.write(f1);
		f1.close();
	}
}

