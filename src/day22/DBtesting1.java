package day22;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class DBtesting1 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		
		java.sql.Connection conn = null;
		String url="JDBC:mysql://localhost:3306/";
		String dbname="test";
		String dbdriver="com.mysql.jdbc.Driver";
		String username="root";
		String password="root";
		Class.forName(dbdriver).newInstance();
		conn=DriverManager.getConnection(url+dbname,"root","root");
		PreparedStatement psmt=conn.prepareStatement("Select * from emp where sal>=? and deptno=?");
		psmt.setString(1,"2000");
		psmt.setString(2,"10");
		ResultSet rs = psmt.executeQuery();
		while(rs.next())
		{
			for(int i=1;i<=8;i++)
			{
				System.out.print(rs.getString(i)+"  ");
			}
			System.out.println();
		}
		

	}

}
