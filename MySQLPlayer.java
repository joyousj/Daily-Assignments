package mypackage;
//testing player's table

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import com.mysql.jdbc.Statement;


public class MySQLPlayer {

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
			sql = "SELECT user_id, user_name, password, email_address FROM test.Player";
			ResultSet rs = stmt.executeQuery(sql);
			//extract data from result set
			while(rs.next()) {
				//cols by name
				int user_id = rs.getInt("user_id");
				String user_name = rs.getString("user_name");
				String password = rs.getString("password");
				String email_address = rs.getString("email_address");
				//display value
				System.out.println("user_id: " + user_id);
				System.out.println("user_name: " + user_name);
				System.out.println("password: " + password);
				System.out.println("email_address: " + email_address);
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

