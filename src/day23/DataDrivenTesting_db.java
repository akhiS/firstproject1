package day23;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataDrivenTesting_db {
	
	FirefoxDriver driver;

	@BeforeMethod
	public void setup()
	{
		driver = new FirefoxDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
	}
	@Test
	public void LinksTest() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException 
	{
		java.sql.Connection conn = null;
		String url="JDBC:mysql://localhost:3306/";
		String dbname="test";
		String dbdriver="com.mysql.jdbc.Driver";
		String username="root";
		String password="root";
		Class.forName(dbdriver).newInstance();
		conn=DriverManager.getConnection(url+dbname,"root","root");
		PreparedStatement psmt=conn.prepareStatement("Select * from registration");
		ResultSet rs=psmt.executeQuery();
		while(rs.next())
		{
			
			driver.findElement(By.name("firstName")).sendKeys(rs.getString(1));
			driver.findElement(By.name("lastName")).sendKeys(rs.getString(2));
			driver.findElement(By.name("phone")).sendKeys(rs.getString(3));
			driver.findElement(By.name("userName")).sendKeys(rs.getString(4));
			driver.findElement(By.name("address1")).sendKeys(rs.getString(5));
			driver.findElement(By.name("city")).sendKeys(rs.getString(6));
			driver.findElement(By.name("state")).sendKeys(rs.getString(7));
			driver.findElement(By.name("postalCode")).sendKeys(rs.getString(8));
			driver.findElement(By.name("country")).sendKeys(rs.getString(9));
			driver.findElement(By.name("email")).sendKeys(rs.getString(10));
			driver.findElement(By.name("password")).sendKeys(rs.getString(11));
			driver.findElement(By.name("confirmPassword")).sendKeys(rs.getString(12));
			driver.findElement(By.name("register")).click();
			String x=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
			if(x.contains(rs.getString(10)))
			{
				System.out.println(rs.getString(10)+" is registered succesfully");
			}
			else
			{
				System.out.println(rs.getString(10)+" is not registered succesfully");
			}
			driver.navigate().back();
		}
		conn.close();
	}
	}


