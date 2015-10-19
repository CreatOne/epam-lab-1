package com.epam.lab1.tools;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.epam.lab1.entity.Aircraft;
import com.epam.lab1.entity.AircraftEnum;
import com.epam.lab1.entity.ConcreteAircraftFactory;
import com.epam.lab1.tools.sort.AircraftSortDistance;

public class AirCompany {
	private List<Aircraft> planes = new ArrayList<Aircraft>();

	/**
	 * Create plane
	 * 
	 * @param plane`s count that will be created
	 */
	public void createPlanes(int count) {
		ConcreteAircraftFactory aircraftFactory = new ConcreteAircraftFactory();
		Random random = new Random();
		for (int i = 0; i < count; i++) {
			planes.add(aircraftFactory.createAircraft(AircraftEnum.values()[random
					.nextInt(AircraftEnum.values().length)].name()));
		}
	}

	/**
	 * Get total passengers count
	 * 
	 * @return Total passengers count
	 */
	public int returnTotalPassengers() {
		int totalPassengers = 0;
		for (Aircraft aircraft : planes) {
			totalPassengers += aircraft.getPassengerCapacity();
		}
		return totalPassengers;
	}

	/**
	 * Get total baggage weight (KG)
	 * 
	 * @return double Total baggage weight in kg
	 */
	public double returnTotalBaggage() {
		double totalBaggage = 0;
		for (Aircraft aircraft : planes) {
			totalBaggage += aircraft.getLiftingCapacity();
		}
		return totalBaggage;
	}

	/**
	 * Display created aircrafts
	 *
	 */
	public void displayPlanes() {
		for (Aircraft aircraft : planes) {
			System.out.println(aircraft);
		}
	}

	/**
	 * Display created aircrafts
	 * 
	 * @param Filtered list of planes
	 */
	public void displayPlanes(List<Aircraft> filtered_planes) {
		for (Aircraft aircraft : filtered_planes) {
			System.out.println(aircraft);
		}
	}

	/**
	 * Return total planes count
	 * 
	 * @return int
	 */
	public int returnPlanesCount() {
		return planes.size();
	}

	/**
	 * Sorting planes list in distance
	 */
	public void sort(String direction) {
		switch (direction) {
			case "Distance":
				Collections.sort(planes, new AircraftSortDistance());
				break;
		}
	}

	/**
	 * Filtering planes by fuel consumption
	 * 
	 * @param gasMin
	 * @param gasMax
	 * @return ArrayList
	 */
	public List<Aircraft> filter(int gasMin, int gasMax) {
		List<Aircraft> result = new ArrayList<>();
		for (Aircraft aircraft : planes) {
			if (aircraft.getConsumption() >= gasMin
					&& aircraft.getConsumption() <= gasMax) {
				result.add(aircraft);
			}
		}
		return result;
	}

	/**
	 * Clear all planes
	 */
	public void destroyPlanes() {
		planes.clear();
	}
	
	/**
	 * Method for jUnit
	 */
	public List<Aircraft> getPlanes() {
		return planes;
	}
}