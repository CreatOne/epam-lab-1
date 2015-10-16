package com.epam.lab1.entity;

/**
 * Abstract aircraft class
 *  
 * @author Govorov Andrey
 *
 */
public abstract class Aircraft {
	private String name; // Наименование самолета
	private String description; // Описание

	private double lifting_capacity; // Грузоподъемность
	private int passenger_capacity; // Вместимость пассажиров
	private double consumption; // Расход топлива
	private double tank_capacity; // Вместимость топливного бака

	public Aircraft() {}

	/**
	 * Constructor
	 * 
	 * @param lifting_capacity
	 * @param passenger_capacity
	 */
	public Aircraft(double lifting_capacity, int passenger_capacity) {
		this.lifting_capacity = lifting_capacity;
		this.passenger_capacity = passenger_capacity;
	}

	/**
	 * Return lifting capacity on the plane
	 * 
	 * @return double
	 */
	public double getLiftingCapacity() {
		return lifting_capacity;
	}

	/**
	 * Return passengers capacity
	 * 
	 * @return int
	 */
	public int getPassengerCapacity() {
		return passenger_capacity;
	}

	/**
	 * Return tank capacity
	 * 
	 * @return double
	 */
	public double getTank_capacity() {
		return tank_capacity;
	}

	/**
	 * Return fuel consumption
	 * 
	 * @return double
	 */
	public double getConsumption() {
		return consumption;
	}

	/**
	 * Set lifting capacity
	 * 
	 * @param lifting_capacity
	 */
	public void setLiftingCapacity(double lifting_capacity) {
		this.lifting_capacity = lifting_capacity;
	}

	/**
	 * Set passenger capacity
	 * 
	 * @param passenger_capacity
	 */
	public void setPassengerCapacity(short passenger_capacity) {
		this.passenger_capacity = passenger_capacity;
	}

	/**
	 * Set tank capacity
	 * 
	 * @param tank_capacity
	 */
	public void setTankCapacity(double tank_capacity) {
		this.tank_capacity = tank_capacity;
	}

	/**
	 * Set fuel consumption
	 * 
	 * @param consumption
	 */
	public void setConsumption(double consumption) {
		this.consumption = consumption;
	}

	/**
	 * Return aircraft`s description
	 * 
	 * @return String
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Return aircraft`s name
	 * 
	 * @return String
	 */
	public String getName() {
		return name;
	}

	/**
	 * Return max distance
	 * 
	 * @return double
	 */
	public double getDistance() {
		// Округляем - 2 знака
		return (double) Math.round((tank_capacity / consumption) * 100) / 100;
	}
}
