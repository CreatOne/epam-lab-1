package com.epam.lab1.tools;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import com.epam.lab1.entity.Aircraft;
import com.epam.lab1.entity.AircraftEnum;
import com.epam.lab1.entity.ConcreteAircraftFactory;
import com.epam.lab1.tools.sort.AircraftSortDistance;

public class AirCompany {
	private ArrayList<Aircraft> planes = new ArrayList<Aircraft>();

	/**
	 * Create plane
	 * 
	 * @param int count
	 */
	public void createPlanes(int count) {
		ConcreteAircraftFactory aircraft_factory = new ConcreteAircraftFactory();
		Random random = new Random();
		for (int i = 0; i < count; i++) {
			planes.add(aircraft_factory.createAircraft(AircraftEnum.values()[random
					.nextInt(AircraftEnum.values().length)].name()));
		}

		// planes.add( aircraft_factory.createAircraft("A380") );
		// planes.add( aircraft_factory.createAircraft("IL14") );
		// planes.add( aircraft_factory.createAircraft("Tu134") );
		// planes.add( aircraft_factory.createAircraft("Boeing767") );
	}

	/**
	 * Get total passengers count
	 * 
	 * @return int Total passengers count
	 */
	public short getTotalPassengers() {
		short totalPassengers = 0;
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
	public double getTotalBaggage() {
		double totalBaggage = (double) 0;
		for (Aircraft aircraft : planes) {
			totalBaggage += aircraft.getLiftingCapacity();
		}
		return totalBaggage;
	}

	/**
	 * Display created aircrafts
	 */
	public void displayPlanes() {
		for (Aircraft aircraft : planes) {
			System.out.println("\t - " + aircraft.getDescription() + " \tdist "
					+ aircraft.getDistance() + "km, \tfuel consumption: "
					+ aircraft.getConsumption());
		}
	}

	/**
	 * Display created aircrafts (override)
	 * 
	 * @param filtered_planes
	 */
	public void displayPlanes(ArrayList<Aircraft> filtered_planes) {
		for (Aircraft aircraft : filtered_planes) {
			System.out.println("\t - " + aircraft.getDescription() + " \tdist "
					+ aircraft.getDistance() + "km, \tfuel consumption: "
					+ aircraft.getConsumption());
		}
	}

	/**
	 * Return total planes count
	 * 
	 * @return int
	 */
	public short getPlanesCount() {
		return (short) planes.size();
	}

	/**
	 * Sorting planes list in distance
	 */
	public void sort() {
		Collections.sort(planes, new AircraftSortDistance());
	}

	/**
	 * Filtering planes by fuel consumption
	 * 
	 * @param int gasMin
	 * @param int gasMax
	 * @return ArrayList
	 */
	public ArrayList<Aircraft> filter(int gasMin, int gasMax) {
		ArrayList<Aircraft> result = new ArrayList<Aircraft>();
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
	public ArrayList<Aircraft> getPlanes() {
		return planes;
	}
}