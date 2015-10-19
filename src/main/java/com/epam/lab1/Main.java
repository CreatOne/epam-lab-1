package com.epam.lab1;

import java.util.List;

import com.epam.lab1.entity.Aircraft;
import com.epam.lab1.tools.AirCompany;

/**
 * Taks number 9. Авиакомпания. Определить иерархию самолетов. Создать авиакомпанию. 
 	Посчитать общую вместимость и грузоподъемность. 
 	Провести сортировку самолетов компании по дальности полета. 
 	Найти самолет в компании, соответствующий заданному диапазону параметров потребления горючего.

 * @author Andrey Govorov
 * @date 09.10.2015
 * @version 1 	
 */
public class Main {	
	public static void main(String[] args) {
		AirCompany aircompany = new AirCompany();

		System.out.println("Create planes:");

		// Creating new planes
		aircompany.createPlanes(5);
		
		// Display all planes
		aircompany.displayPlanes();
		System.out.println("Planes count: " + aircompany.returnPlanesCount());
		System.out.println();
		
		// Display total info
		System.out.println("Total passenger: " + aircompany.returnTotalPassengers() + " persons.");
		System.out.println("Total baggage: " + aircompany.returnTotalBaggage() + " kg\n");

		// Sort by distance
		System.out.println("Distance sort: ");
		aircompany.sort("Distance");
		aircompany.displayPlanes();

		// Fuel consumption filter
		int min = 50;
		int max = 90;
		System.out.println();
		System.out.println("Filtered list (Fuel consumption: "+min+"-"+max+"): ");
		List<Aircraft> filteredPlanes = aircompany.filter(min, max);
		aircompany.displayPlanes(filteredPlanes);
	}
}
