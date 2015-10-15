package day17;

import java.io.FileInputStream;
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

public class ExcelDropDown {

	public static void main(String[] args) throws IOException {
		
		FileInputStream f= new FileInputStream("C:\\Users\\Acer\\Desktop\\New folder\\workbook.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("sheet1");
		
		Row r=null;
		Cell c=null;
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.newtours.demoaut.com/");
		
		driver.findElement(By.linkText("REGISTER")).click();
		WebElement drop=driver.findElement(By.name("country"));
		List<WebElement> dropdown=drop.findElements(By.tagName("option"));
		for(int i=0;i<dropdown.size();i++)
		{
			dropdown.get(i).click();
			if(dropdown.get(i).isSelected())
			{
				c.setCellValue(true);
				
				
				
			}
			else
			{
				c.setCellValue(false);	
			}
		}
		FileOutputStream  f1=new FileOutputStream("C:\\Users\\Acer\\Desktop\\New folder\\workbook.xlsx");
		wb.write(f1);
		f1.close();
		

	}

}
