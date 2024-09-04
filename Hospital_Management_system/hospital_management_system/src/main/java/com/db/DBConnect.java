package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

	private static Connection conn=null;

	public static Connection getConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","mamta");

		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
	}

}