package com.epam.lab1.plane;

public class Plane 
{
	private double lifting_capacity;			// ����������������
	private int passenger_capacity;		// ����������� ����������
	
	public Plane(double d, int i)
	{
		this.lifting_capacity = d;
		this.passenger_capacity = i;
	}
	
	public double getLiftingCapacity() 
	{
		return this.lifting_capacity;
	}
	
	public int getPassengerCapacity() 
	{
		return this.passenger_capacity;
	}
	
	public void setLiftingCapacity(short new_capacity) 
	{
		this.lifting_capacity = new_capacity;
	}
	
	public void setPassengerCapacity(short new_capacity) 
	{
		this.passenger_capacity = new_capacity;
	}
}
