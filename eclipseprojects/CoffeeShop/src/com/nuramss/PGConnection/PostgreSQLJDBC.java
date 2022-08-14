package com.nuramss.PGConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSQLJDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Connection con = null;

		Class.forName("org.postgresql.Driver");
		con = DriverManager
				.getConnection("jdbc:postgresql://localhost:5432/olistbrazil",
						"postgres", "VGuru1008");
		System.out.println("Opened database successfully");

	}

}
