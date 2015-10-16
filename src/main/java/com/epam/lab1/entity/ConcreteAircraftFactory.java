package com.epam.lab1.entity;

import com.epam.lab1.planes.A380_Aircraft;
import com.epam.lab1.planes.Boeing_767_Aircraft;
import com.epam.lab1.planes.IL_14_Aircraft;
import com.epam.lab1.planes.TU_134_Aircraft;

public class ConcreteAircraftFactory implements AircraftFactory {

	public Aircraft createAircraft(String name) {
		if (name.equals("A380")) {
			return new A380_Aircraft();
		} else if (name.equals("IL14")) {
			return new IL_14_Aircraft();
		} else if (name.equals("Tu134")) {
			return new TU_134_Aircraft();
		} else if (name.equals("Boeing767")) {
			return new Boeing_767_Aircraft();
		}

		return null;
	}
}
