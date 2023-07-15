package com.udemy.mahabal;

import java.io.Serializable;

public class Vehicle implements Serializable{
	private static final long serialVersionUID = 1L;
	private String vehicleType;
	private int vehicleNumber;
	public Vehicle(String vehicleType, int vehicleNumber) {
		this.vehicleType = vehicleType;
		this.vehicleNumber = vehicleNumber;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public int getVehicleNumber() {
		return vehicleNumber;
	}
	@Override
	public String toString() {
		return "Vehicle [vehicleType=" + vehicleType + ", vehicleNumber=" + vehicleNumber + "]";
	}
	
	
	

}
