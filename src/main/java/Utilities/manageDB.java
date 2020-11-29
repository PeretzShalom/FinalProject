package Utilities;

import java.sql.DriverManager;

public class manageDB extends CommonOps {
	public static void initConnection(String dbURl, String user, String pass) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(dbURl, user, pass);
			stmt = con.createStatement();
		} catch (Exception e) {
			System.out.println("Error occurred while connecting to DB,See details:" + e);
		}
	}
	
	public static void closeConnection() {
		try {
			con.close();
		} catch (Exception e) {
			System.out.println("Error occurred while closing DB,See details:" + e);
		}
	}
}
