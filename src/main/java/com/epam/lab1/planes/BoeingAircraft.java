package com.epam.lab1.planes;

import com.epam.lab1.entity.Aircraft;

public class BoeingAircraft extends Aircraft {
	private int vipPlaces;

	/**
	 * Create new aircraft
	 * 
	 * @param name Aircraft`s name
	 * @param consumption Fuel consumption
	 * @param tankCapacity Max tank capacity
	 * @param liftingCapacity Max lifting capacity
	 * @param passengerCapacity Max passenger`s capacity
	 */
	public BoeingAircraft(String name, double consumption,
			double tankCapacity, double liftingCapacity, int passengerCapacity) {
		super(name, consumption, tankCapacity, liftingCapacity,
				passengerCapacity);

		vipPlaces = 30;
	}

	@Override
	public String toString() {
		return this.getClass() + " [" + "name=" + name + ", " 
				+ "consumption=" + consumption + ", " 
				+ "distance=" + getDistance() + ", "
				+ "tankCapacity=" + tankCapacity + ", "
				+ "liftingCapacity=" + liftingCapacity + ", "
				+ "passengerCapacity=" + passengerCapacity + ", "
				+ "vipPlaces=" + vipPlaces + "]";
	}
}