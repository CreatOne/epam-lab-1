/**
 * Taks number 9 - Planes
 * @author Andrey Govorov
 * @date 09.10.2015
 * @version 1
 
 	9.	Авиакомпания. Определить иерархию самолетов. Создать авиакомпанию. Посчитать общую вместимость и грузоподъемность. 
 	Провести сортировку самолетов компании по дальности полета. Найти самолет в компании, 
 	соответствующий заданному диапазону параметров потребления горючего.
 */

package com.epam.lab1.launcher;

import java.util.ArrayList;

import com.epam.lab1.Aircraft;
import com.epam.lab1.tools.Dispatcher;

public class Main {
	public static void main(String[] args) {
		Dispatcher dispatcher = new Dispatcher();

		System.out.println("Create planes:");

		// Creating new planes
		dispatcher.createPlanes(5);

		// Display all planes
		dispatcher.displayPlanes();
		System.out.println("Planes count: " + dispatcher.getPlanesCount());

		// Show total information
		System.out.println("\nTotal passenger: "
				+ dispatcher.getTotalPassengers() + " persons.");
		System.out.println("Total baggage: " + dispatcher.getTotalBaggage()
				+ " kg\n");

		// Sort list
		System.out.println("Distance sort: ");
		dispatcher.sort();
		dispatcher.displayPlanes();

		// Filter by consumption
		int min = 50;
		int max = 90;
		System.out.println("\nFiltered list (" + min + "-" + max + "): ");
		ArrayList<Aircraft> filtered_planes = dispatcher.filter(min, max);
		dispatcher.displayPlanes(filtered_planes);
	}
}
