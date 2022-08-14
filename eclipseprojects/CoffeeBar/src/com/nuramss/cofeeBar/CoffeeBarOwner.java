package com.nuramss.cofeeBar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CoffeeBarOwner {

	List<String> menus = new ArrayList<>();

	Map<String, Double> price = new HashMap<>();

	protected void cofeeMachineStatus() {

		menus.add("Coffee");
		menus.add("Latte");

		price.put("Coffee", 1.25);
		price.put("Latte", 0.75);

		System.out.println("\nToday's available menus are :- ");

		for (String menu : menus) {
			System.out.println("\t\t@ " + menu + " ----- $ " + price.get(menu));
		}

	}

	protected void displayOwnerOptions() {
		System.out.println("\nSelect one of the below choices to manage shop :- ");
		System.out.println("\t # '1'  to Add new menu item ");
		System.out.println("\t # '2'  to Remove an existing menu item ");
		System.out.println("\t # '3'  to Change menu item price ");
		System.out.println("\t # '4'  to Exit ");

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int getchoice = scan.nextInt();

		switch (getchoice) {
		case 1:
			addMenuItem();
			break;
		case 2:
			removeMenuItem();
			break;
		case 3:
			getMenuPrice();
			break;
		case 4:
			System.out.println("\n\tYou are opted to exit the menu. Have A Good Day!");
			break;
		}
	}

	protected void getMenuPrice() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the menu item for which the price to be changed : ");
		String titem = scan.next();
		System.out.println("Enter the new price : ");
		double tprice = scan.nextDouble();
		price.replace(titem, tprice);

		System.out.println("\nToday's available menus with modified price :- ");

		for (String menu : menus) {
			System.out.println("\t\t@ " + menu + " ----- $ " + price.get(menu));
		}
	}

	protected void addMenuItem() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("How many items you want to add : ");

		for (int i = 0; i < scan.nextInt(); i++) {
			System.out.println("Enter the menu item name: ");
			String titem = scan.next();
			menus.add(titem);
			System.out.println("Enter the menu item price : ");
			price.put(titem, scan.nextDouble());
		}

		System.out.println("\nToday's available menus are :- ");

		for (String menu : menus) {
			System.out.println("\t\t@ " + menu + " ----- $ " + price.get(menu));
		}

	}

	protected void removeMenuItem() {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		menus.remove(menus.indexOf(scan.next()));

		System.out.println("\nToday's available menus after removal are :- ");

		for (String menu : menus) {
			System.out.println("\t\t@ " + menu + " ----- $ " + price.get(menu));
		}

	}

}
