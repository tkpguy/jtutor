package com.nuramss.postgresJavaConnection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class PostgresJavaConnection {

	public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
		
		Properties prop = new Properties();
		FileReader fr = new FileReader(".\\src\\rsrcs\\pgdb.properties");
		prop.load(fr);
		
		String pguser = prop.getProperty("pgusr");
		String pgpwd = prop.getProperty("pgpwd");
		String pgurl = prop.getProperty("pgcon");
		
		
		System.out.println(pgurl);
		
		Connection pgcon = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Postgresql14?user=postgres&password=VGuru1008&ssl=true");

	}

}
