package com.nuramss.fileMgt;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class FileMgt {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("D:\\eclipseprojects\\PropertiesFile\\src\\firstpropfile.properties");
		
		Properties p = new Properties();
		
		p.load(fr);
		
		System.out.println(p.get("Name"));
		
		int age = 0;
		
		System.out.println("Bafore assignng file value : " + age);
		
		age = Integer.parseInt((String) p.getProperty("Age"));
		
		double cgpa = 0.0;
		
		cgpa = Double.parseDouble((String) p.getProperty("cgpa"));
		
		System.out.println("After assigning file value: " +age);
		System.out.println(cgpa);

	}
	

}
