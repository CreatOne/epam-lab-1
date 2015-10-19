package com.epam.lab1.planes;

import com.epam.lab1.entity.Aircraft;

public class TupolevAircraft extends Aircraft {
	private int turbineCounts;

	/**
	 * Create new aircraft
	 * 
	 * @param name Aircraft`s name
	 * @param consumption Fuel consumption
	 * @param tankCapacity Max tank capacity
	 * @param liftingCapacity Max lifting capacity
	 * @param passengerCapacity Max passenger`s capacity
	 */
	public TupolevAircraft(String name, double consumption,
			double tankCapacity, double liftingCapacity, int passengerCapacity) {
		super(name, consumption, tankCapacity, liftingCapacity,
				passengerCapacity);

		turbineCounts = 4;
	}

	@Override
	public String toString() {
		return this.getClass() + " [" + "name=" + name + ", " 
				+ "consumption=" + consumption + ", "
				+ "distance=" + getDistance() + ", "
				+ "tankCapacity=" + tankCapacity + ", "
				+ "liftingCapacity=" + liftingCapacity + ", "
				+ "passengerCapacity=" + passengerCapacity + ", "
				+ "turbineCounts=" + turbineCounts + "]";
	}
}