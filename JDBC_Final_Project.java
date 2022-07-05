package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Final_Project {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/amazon";
		String username="root";
		String password="root";
		String query="Select * from products;";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection(dbUrl, username, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		
		while(rs.next())
		{
			System.out.print("Brand:    "+rs.getString("brand")+"\t\t");
			System.out.print("Model_Name:  "+rs.getString("model_name")+"\t\t");
			System.out.print("Price:"+rs.getString("price")+"\t");
			System.out.println();
		}
		
	}

}
