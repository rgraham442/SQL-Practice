package SQLconection;

import java.sql.*;

public class AddPractice {

	static final String DB_URL = "jdbc:mysql://localhost/thedailygrind";

	static final String USER = "practice";
	static final String PASS = "truepass";
	
	public static void main(String[] args) {

		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();) {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			System.out.println("Connecting to database...");
			
			String sql= "INSERT INTO product (name, stock, type, cost) "+ 
			"VALUES (\"Kenya Peaberry Ground Coffee\", 80, \"Ground Coffee\", 6)";
			stmt.executeUpdate(sql);
			System.out.println("Inserted records into the table...");
			
		}
		catch (SQLException se) {
			se.printStackTrace();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void addToMultiple() {
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();) {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			System.out.println("Connecting to database...");
			
			String sql= "INSERT INTO product (name, stock, type, cost) "+ 
			"VALUES (\"V60 Coffee Server\", 180, \"Coffee Maker\", 24)";
			stmt.executeUpdate(sql);
			
			System.out.println("Inserted records into the table...");
			
		}
		catch (SQLException se) {
			se.printStackTrace();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
