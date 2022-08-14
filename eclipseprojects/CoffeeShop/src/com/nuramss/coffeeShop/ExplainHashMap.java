package com.nuramss.coffeeShop;

import java.util.HashMap;
import java.util.Map;

public class ExplainHashMap {

	public static void main(String[] args) {
	
		//prices = {"Coffee" : 1.25, "Black Coffee" : 0.75};
		
		Map<String, Integer> fnames = new HashMap<>();
		
		for(int i=0 ; i<4  ; i++) {
			fnames.put("Karthi", 40);
			fnames.put("Amma", 36);
			fnames.put("Monesh", 22);
			fnames.put("Kanishkaa", 16);
		}
		
		System.out.println(fnames);
		
		fnames.replace("Karthi", 38);
		
		System.out.println(fnames);
		
		fnames.put("Mani", 24);
		fnames.put("Gayathri", 23);
		
		System.out.println(fnames);
		
	}

}
