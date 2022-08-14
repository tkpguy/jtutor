package com.nuramss.coffeeShop;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class HandlePropertiesFile {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("D:\\eclipseprojects\\CoffeeShop\\src\\com\\nuramss\\coffeeShop\\measure.properties");
		Properties prop = new Properties();
		prop.load(fr);
		System.out.println(prop.getProperty("milk"));

	}

}
