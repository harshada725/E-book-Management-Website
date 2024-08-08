package com.conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	public static Connection conn = null;

	public static Connection getConnection() {
		try {

			if (conn == null) {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebook-app", "root", "radhakrishna$0625@@");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
	}

}
