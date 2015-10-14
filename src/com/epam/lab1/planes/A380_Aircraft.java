package com.epam.lab1.planes;

import com.epam.lab1.Aircraft;

public class A380_Aircraft extends Aircraft {
	private final String name = "Airbus A380";
	
	public A380_Aircraft() {
		super();
		// TODO Auto-generated constructor stub
		setConsumption(100);				// 100l/100 km				
		setLiftingCapacity(5000);			// kg
		setPassengerCapacity((short) 500);			
		setTankCapacity(25000);				// Liters
	}
	
	public String getDescription() {
        return name;
    }
}
