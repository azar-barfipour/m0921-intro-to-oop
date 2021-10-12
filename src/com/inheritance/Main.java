package com.inheritance;

import com.inheritance.vehicles.Bike;

public class Main {

	public static void main(String[] args) {
		
		Bike bike = new Bike("long", "Diesel", 2, 1, 10, "LED");

		System.out.println(bike);
	}

}
