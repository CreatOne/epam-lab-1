package com.epam.lab1.planes;

import com.epam.lab1.entity.Aircraft;

public class AerobusAircraft extends Aircraft {
	private String engineType;

	/**
	 * Create new aircraft
	 * 
	 * @param name Aircraft`s name
	 * @param consumption Fuel consumption
	 * @param tankCapacity Max tank capacity
	 * @param liftingCapacity Max lifting capacity
	 * @param passengerCapacity Max passenger`s capacity
	 */
	public AerobusAircraft(String name, double consumption,
			double tankCapacity, double liftingCapacity, int passengerCapacity) {
		super(name, consumption, tankCapacity, liftingCapacity,
				passengerCapacity);

		engineType = "Triple turbo Supercharger L599-5F";
	}

	@Override
	public String toString() {
		return this.getClass() + " [" + "name=" + name + ", \t" 
				+ "consumption=" + consumption + ", \t" 
				+ "distance=" + getDistance() + ", \t"
				+ "tankCapacity=" + tankCapacity + ", \t"
				+ "liftingCapacity=" + liftingCapacity + ", \t"
				+ "passengerCapacity=" + passengerCapacity + ", \t"				
				+ "engineType=" + engineType + "]";
	}
}
