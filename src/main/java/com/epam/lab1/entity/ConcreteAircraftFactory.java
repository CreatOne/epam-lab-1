package com.epam.lab1.entity;

import com.epam.lab1.planes.AerobusAircraft;
import com.epam.lab1.planes.IlushinAircraft;
import com.epam.lab1.planes.TupolevAircraft;
import com.epam.lab1.planes.BoeingAircraft;

public class ConcreteAircraftFactory implements AircraftFactory {
	public Aircraft createAircraft(String name) {
		switch (name) {
			case "A380":
				return new AerobusAircraft("Aerobus A380", 200, 5000, 10000, 500);
	
			case "A330":
				return new AerobusAircraft("Aerobus A330", 200, 5000, 10000, 500);
	
			case "IL14":
				return new IlushinAircraft("IL-14", 70, 7000, 200, 30);
	
			case "IL28":
				return new IlushinAircraft("IL-28", 50, 5000, 300, 56);
	
			case "Tu134":
				return new TupolevAircraft("TU-34", 150, 2500, 10000, 72);
	
			case "Tu108":
				return new TupolevAircraft("TU-108", 180, 4000, 6000, 67);
	
			case "Boeing767":
				return new BoeingAircraft("Boeing-767", 200, 14500, 300, 325);
	
			case "Boeing744":
				return new BoeingAircraft("Boeing-744", 240, 12500, 350, 250);
		}

		return null;
	}
}
