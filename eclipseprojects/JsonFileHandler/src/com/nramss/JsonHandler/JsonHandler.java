package com.nramss.JsonHandler;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonHandler {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException, ParseException {
		
		JSONParser jp = new JSONParser();
		FileReader fr = new FileReader(".\\files\\first.json");
		
		JSONObject jo = (JSONObject) jp.parse(fr);
		String fname = (String) jo.get("firstname");
		String lname = (String) jo.get("lastname");
		
		System.out.println("Welcome Ms." + fname + " " + lname);
		
		JSONArray ja = (JSONArray) jo.get("address");
		
		System.out.println(ja.get(0));

	}

}
