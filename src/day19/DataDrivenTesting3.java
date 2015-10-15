package day19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataDrivenTesting3 {
	
	FirefoxDriver driver;

	@BeforeMethod
	public void setup()
	{
		driver = new FirefoxDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
	}
	@Test
	public void LinksTest() throws IOException
	{
		FileInputStream f=new FileInputStream("F:\\seleinum\\firstproject\\src\\com\\qedge\\excelfiles\\registration.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Iterator<Row> row=ws.iterator();
		Row locrow=row.next();
		while(row.hasNext())
		{
			Row datarow =row.next();
			int c=datarow.getLastCellNum();
			for(int i=0;i<c;i++)
			{
				driver.findElement(By.name(locrow.getCell(i).getStringCellValue())).sendKeys(datarow.getCell(i).getStringCellValue());
			
			}
			driver.findElement(By.name("register")).click();
			String x=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
			if(x.contains(datarow.getCell(9).getStringCellValue()))
			{
				datarow.createCell(12).setCellValue("passed");
			}
			else
			{
				datarow.createCell(12).setCellValue("failed");
			}
			driver.navigate().back();
		}
		FileOutputStream f1=new FileOutputStream("F:\\seleinum\\firstproject\\src\\com\\qedge\\resultexcelfiles\\regi1.xlsx");
		wb.write(f1);
		f1.close();
		driver.close();
	}
	
	
}
