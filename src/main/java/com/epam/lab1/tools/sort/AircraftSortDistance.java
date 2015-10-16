package com.epam.lab1.tools.sort;

import java.util.Comparator;

import com.epam.lab1.entity.Aircraft;

public class AircraftSortDistance implements Comparator<Aircraft> {
	public int compare(Aircraft obj1, Aircraft obj2) {
		double distance1 = obj1.getDistance();
		double distance2 = obj2.getDistance();
	     
		if (distance1 > distance2) {
			return 1;
		} else if (distance1 < distance2) {
			return -1;
		} else {
			return 0;
		}
	}
}
