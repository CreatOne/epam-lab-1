package com.epam.lab1.planes;

import com.epam.lab1.Aircraft;

public class IL_14_Aircraft  extends Aircraft  {
	private final String name = "ИЛ-14";

	public IL_14_Aircraft() {
		super();
		// TODO Auto-generated constructor stub
		setConsumption(70);					// 70L/100 km				
		setLiftingCapacity(2000);			// kg
		setPassengerCapacity((short) 30);			
		setTankCapacity(7000);				// Liters
	}
	
	public String getDescription() {
        return name;
    }
}
