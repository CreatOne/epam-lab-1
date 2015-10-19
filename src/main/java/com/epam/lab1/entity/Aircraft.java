package com.epam.lab1.entity;

/**
 * Abstract aircraft class
 * 
 * @author Govorov Andrey
 */
public abstract class Aircraft {
	protected String name; // Наименование самолета
	protected double liftingCapacity; // Грузоподъемность
	protected int passengerCapacity; // Вместимость пассажиров
	protected double consumption; // Расход топлива
	protected double tankCapacity; // Вместимость топливного бака

	/**
	 * Create new aircraft
	 * 
	 * @param name Aircraft`s name
	 * @param consumption Fuel consumption
	 * @param tankCapacity Max tank capacity
	 * @param liftingCapacity Max lifting capacity
	 * @param passengerCapacity Max passenger`s capacity
	 */
	public Aircraft(String name, double consumption, double tankCapacity,
			double liftingCapacity, int passengerCapacity) {
		this.name = name;
		this.consumption = consumption;
		this.tankCapacity = tankCapacity;
		this.liftingCapacity = liftingCapacity;
		this.passengerCapacity = passengerCapacity;
	}

	/**
	 * Return lifting capacity on the plane
	 * 
	 * @return weight
	 */
	public double getLiftingCapacity() {
		return liftingCapacity;
	}

	/**
	 * Return max passengers capacity
	 * 
	 * @return Max passengers count
	 */
	public int getPassengerCapacity() {
		return passengerCapacity;
	}

	/**
	 * Return tank capacity
	 * 
	 * @return Max gasoline volume
	 */
	public double getTankCapacity() {
		return tankCapacity;
	}

	/**
	 * Return fuel consumption
	 * 
	 * @return consumption
	 */
	public double getConsumption() {
		return consumption;
	}

	/**
	 * Set lifting capacity
	 * 
	 * @param lifting capacity
	 */
	public void setLiftingCapacity(double liftingCapacity) {
		this.liftingCapacity = liftingCapacity;
	}

	/**
	 * Set passenger capacity
	 * 
	 * @param passenger capacity
	 */
	public void setPassengerCapacity(short passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}

	/**
	 * Set tank capacity
	 * 
	 * @param tank capacity
	 */
	public void setTankCapacity(double tankCapacity) {
		this.tankCapacity = tankCapacity;
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
	 * Return aircraft`s name
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Return max distance
	 * 
	 * @return distance
	 */
	public double getDistance() {
		// Округляем - 2 знака
		return (double) Math.round((tankCapacity / consumption) * 100) / 100;
	}
}
