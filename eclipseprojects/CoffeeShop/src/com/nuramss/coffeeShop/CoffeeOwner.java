package com.nuramss.coffeeShop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CoffeeOwner {

	// String menus[] = {"Coffee", "Black Coffee"};

	/*
	 * double milkqty=5.0; double cpowderqty=3.5; double waterqty=5.0; double
	 * sugarqty=7.0;
	 */

	List<String> menus = new ArrayList<>();
	Map<String, Double> prices = new HashMap<>();

	public void displayMachineState() {
		menus.add("Coffee");
		menus.add("Black Coffee");

		prices.put("Coffee", 1.25);
		prices.put("Black Coffee", 0.75);

		System.out.println("Original item list: ");

		for (String menu : menus) {
			System.out.println("\t  @  " + menu + " ----- $ " + prices.get(menu));
		}

	}

	public void addMenuItem() {

		System.out.println("Enter number of items you want to add : ");
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		int nofitems = s.nextInt();

		for (int i = 0; i < nofitems; i++) {
			System.out.println("Enter item name : ");
			String titem = s.next();
			menus.add(titem);
			System.out.println("Enter the item price : ");
			prices.put(titem, s.nextDouble());
		}

		System.out.println("Modifid item list: ");

		for (String menu : menus) {
			System.out.println("\t  @  " + menu + " ----- $ " + prices.get(menu));
		}

	}

	public void removeMenuItem() {

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the menu item to be removed : ");
		menus.remove(menus.indexOf(s.next()));

		System.out.println("Item list after removal: ");

		for (String menu : menus) {
			System.out.println("\t  @  " + menu);
		}

	}

	public void changePrice() {

	}

	public void checkListPrice() {
		System.out.println(menus);
		System.out.println(prices);
	}

}
