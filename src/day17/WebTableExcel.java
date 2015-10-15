package day17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTableExcel {
	
	FirefoxDriver driver;

	@BeforeMethod
	public void setup()
	{
		driver = new FirefoxDriver();
		driver.get("http://www.timeanddate.com/worldclock/");
	}
	@Test
	public void Webtabletest() throws IOException
	{
		FileInputStream f=new FileInputStream("C:\\Users\\Acer\\Desktop\\New folder\\workbook1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Row r=null;
		WebElement table=driver.findElement(By.xpath("html/body/div[1]/div[7]/section[2]/div[1]/table"));
		List<WebElement> rows =table.findElements(By.tagName("tr"));
		for(int i=0;i<rows.size();i++)
		{
			r=ws.createRow(i);
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			for(int j=0;j<cols.size();j++)
			{
				r.createCell(j).setCellValue(cols.get(j).getText());
			}
		}
		FileOutputStream f1=new FileOutputStream("C:\\Users\\Acer\\Desktop\\New folder\\workbook1.xlsx");
		wb.write(f1);
		f1.close();
		driver.close();
	}

}
