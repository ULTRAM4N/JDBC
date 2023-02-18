package JDBC;
import java.sql.*;
public class InsertJDBC {
	
	public static void main(String [] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/hibernate";
			Connection con = DriverManager.getConnection(url , "root", "Gixxer@250");
			System.out.println("Connected");
			
			// create a query
//			String query = "Select * from course";
			String query = "create table table1(tId int(20) primary key auto_increment, tName varchar(200) not null, tCity varchar(400))";
			Statement stmnt = con.createStatement();
//			ResultSet set = stmnt.executeQuery(query);
			stmnt.executeUpdate(query);
			System.out.println("table created");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
