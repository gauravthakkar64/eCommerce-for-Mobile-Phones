package com.flipmart.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.flipmart.util.EComConstants;

public class JDBC {

	private static JDBC jdbc;
	private static String rootPath;

	private JDBC() {
	}

	public static JDBC getInstance() {
		if (jdbc == null) {
			jdbc = new JDBC();
		}
		return jdbc;
	}

	public Connection getConnection() throws ClassNotFoundException, SQLException {
		loadProperties();
		Connection con = null;
		try {
			con = DriverManager.getConnection(
					EComConstants.ADDRESS + ":" + EComConstants.PORT + "/" + EComConstants.DATABASE,
					EComConstants.USER, EComConstants.PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	private void loadProperties() {
		// TODO Auto-generated method stub
		
	}
}