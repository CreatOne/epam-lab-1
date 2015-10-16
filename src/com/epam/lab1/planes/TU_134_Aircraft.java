package com.epam.lab1.planes;

import com.epam.lab1.entity.Aircraft;

public class TU_134_Aircraft extends Aircraft {
	private final String name = "ТУ-134";
	
	public TU_134_Aircraft() {
		super();
		// TODO Auto-generated constructor stub
		setConsumption(150);				// 150L/100 km				
		setLiftingCapacity(2500);			// kg
		setPassengerCapacity((short) 72);			
		setTankCapacity(10000);				// Liters
	}
	
	public String getDescription() {
        return name;
    }
}
