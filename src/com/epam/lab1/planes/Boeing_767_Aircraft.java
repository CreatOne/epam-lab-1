package com.epam.lab1.planes;

import com.epam.lab1.Aircraft;

public class Boeing_767_Aircraft extends Aircraft {
	private final String name = "Boeing 767";
	
	public Boeing_767_Aircraft() {
		super();
		// TODO Auto-generated constructor stub
		setConsumption(120);				// 70L/100 km				
		setLiftingCapacity(3000);			// kg
		setPassengerCapacity((short) 325);			
		setTankCapacity(14500);				// Liters
	}
	
	public String getDescription() {
        return name;
    }
}