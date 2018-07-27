package SQLconection;

import java.sql.*;

public class Practice {

	static final String DB_URL = "jdbc:mysql://localhost/thedailygrind";

	static final String USER = "practice";
	static final String PASS = "truepass";

	public static void main(String[] args) {

		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();) {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			System.out.println("Connecting to database...");
			System.out.println("Creating statement...");
			String sql;
			sql = "SELECT name FROM product";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String first = rs.getString("name");
				System.out.println("Name: " + first);
			}
			rs.close();
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
