package JDBC;
import java.sql.*;
public class FirstJdbc {
	public static void main(String [] args) {
		try {
			// 1. -> Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. -> Create a connection
			String url = "jdbc:mysql://localhost:3306/hibernate";
			String userName = "root";
			String password = "Gixxer@250";
			Connection con = DriverManager.getConnection(url , userName, password);
			
			if(con.isClosed()) {
				System.out.println("Connection is closed");
			} else System.out.println("Connection Created");
			// 3. -> Create a query
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
