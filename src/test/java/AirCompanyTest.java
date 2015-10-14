package test.java;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.epam.lab1.Aircraft;
import com.epam.lab1.tools.AirCompany;

public class AirCompanyTest{
	AirCompany aircompany = new AirCompany();
	
	@Test
	public void createPlanes() {	
		aircompany.createPlanes(7);
		assertEquals(7, aircompany.getPlanesCount());
		
		aircompany.destroyPlanes();
		aircompany.createPlanes(10);
		assertEquals(10, aircompany.getPlanesCount());
	}
	
	@Test
	public void totalPassengers() {
		aircompany.destroyPlanes();
		aircompany.createPlanes(5);
		
		int _totalPassengers = 0;
		
		ArrayList<Aircraft> planesList = aircompany.getPlanes();
		for (Aircraft aircraft : planesList) {
			_totalPassengers += aircraft.getPassengerCapacity();
		}
		
		assertEquals(_totalPassengers, aircompany.getTotalPassengers());
	}
	
	@Test
	public void totalBaggage() {
		aircompany.destroyPlanes();
		aircompany.createPlanes(5);
		
		double _totalBaggage = 0;
		
		ArrayList<Aircraft> planesList = aircompany.getPlanes();
		for (Aircraft aircraft : planesList) {
			_totalBaggage += aircraft.getLiftingCapacity();
		}

		assertEquals( _totalBaggage, aircompany.getTotalBaggage(), 0);
	}
}
