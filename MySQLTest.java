package mypackage;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import com.mysql.jdbc.Statement;

//example 
public class MySQLTest {

	public static void main(String[] argv) {

		System.out.println("-----MySQL JDBC Connection Testing-----");
		Statement stmt = null;

		try {
			System.out.println("MySQL JDBC Driver Registered");
			Connection connection = null;
			try {
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");
			} catch (SQLException e) {
				System.out.println("Connection Failed! Check output console");
				e.printStackTrace();
				return;
			}
			if(connection != null) {
				System.out.println("Connected to Database");
			} else {
				System.out.println("Failed to make connection!");
			}
			//execute a query
			System.out.println("Creating statement...");
			stmt = (Statement) connection.createStatement();
			String sql;
			sql = "SELECT ID, STATE FROM test.Emp";
			ResultSet rs = stmt.executeQuery(sql);
			//extract data from result set
			while(rs.next()) {
				//cols by name
				int id = rs.getInt("ID");
				String state = rs.getString("State");
				//display value
				System.out.println("ID " + id);
				System.out.println("State " + state);
			}
			rs.close();
			stmt.close();
			connection.close();
		} catch (SQLException se) {
			//handles errors
			se.printStackTrace();
		} catch (Exception e) {
			//handles errors for class.name
			e.printStackTrace();
		}
	}
}

