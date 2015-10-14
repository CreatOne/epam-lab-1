package com.epam.lab1;

import java.util.Comparator;

public class AircraftSortDistance implements Comparator<Aircraft>  {
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
