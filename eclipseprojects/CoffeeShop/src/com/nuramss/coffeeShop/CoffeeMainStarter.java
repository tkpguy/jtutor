package com.nuramss.coffeeShop;

public class CoffeeMainStarter {

	public static void main(String[] args) {
		
		CoffeeOwner owner = new CoffeeOwner();
		
		owner.displayMachineState();
		owner.addMenuItem();
		owner.checkListPrice();  //--> To check the code and remove to further migration
		//owner.removeMenuItem();

	}

}
