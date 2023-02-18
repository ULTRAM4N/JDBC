package JDBC;

import java.sql.*;

public class PrestatementQueryInsert {
	public static void main(String [] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/hibernate";
			Connection con = DriverManager.getConnection(url , "root", "Gixxer@250");
			System.out.println("Connected");
			
			// create a query
//			String query = "Select * from course";
			String query = "insert into table1(tName,tCity) values(?,?)";
			
			// get the PreParedStatement object
			PreparedStatement pstmnt = con.prepareStatement(query);
			
			// set the values to query
			
			pstmnt.setString(1, "Rajeev Sharma");
			pstmnt.setString(2, "Noida");
//			ResultSet set = stmnt.executeQuery(query);
			pstmnt.executeUpdate();
			System.out.println("Inserted...");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
