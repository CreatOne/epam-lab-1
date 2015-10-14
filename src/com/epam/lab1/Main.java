/**
 * Taks number 9 - Planes
 * @author Andrey Govorov
 * @date 09.10.2015
 * @version 1
 
 	9.	������������. ���������� �������� ���������. ������� ������������. ��������� ����� ����������� � 
 	����������������. �������� ���������� ��������� �������� �� ��������� ������. ����� ������� � ��������, 
 	��������������� ��������� ��������� ���������� ����������� ��������.
 */

package com.epam.lab1;

import java.util.ArrayList;

public class Main {	
	public static void main(String[] args) {
		Dispatcher dispatcher = new Dispatcher();

		System.out.println("Create planes:");

		// Creating new planes
		dispatcher.createPlanes(5);
		
		// Display all planes
		dispatcher.displayPlanes();
		System.out.println("Planes count: " + dispatcher.getPlanesCount());
		
		// ����� ����������� � ����������������
		System.out.println("\nTotal passenger: " + dispatcher.getTotalPassengers() + " persons.");
		System.out.println("Total baggage: " + dispatcher.getTotalBaggage() + " kg\n");

		// ��������� �� ��������� ������
		System.out.println("Distance sort: ");
		dispatcher.sort();
		dispatcher.displayPlanes();

		// ������� ��������������� ���������
		int min = 50;
		int max = 90;
		System.out.println("\nFiltered list ("+min+"-"+max+"): ");
		ArrayList<Aircraft> filtered_planes = dispatcher.filter(min, max);
		dispatcher.displayPlanes(filtered_planes);
	}
}
