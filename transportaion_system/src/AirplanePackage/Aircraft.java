// -----------------------------------------------------
// COMP249
// Assignment 2
// Part 1
// Written by: 
// -----------------------------------------------------

package AirplanePackage;

import vehiclePackage.Vehicle;

/**
 *'Aircraft' has price(double), maxElevation(double).
 *Extends 'Vehicle' class.
 */
public class Aircraft extends Vehicle{

	private double price;
	private double maxElevation;
	
	public double getPrice() {double returnDouble = this.price; return returnDouble;} //accessors
	public double getMaxElevation() {double returnDouble = this.maxElevation; return returnDouble;}
	
	private void setPrice(double price) {this.price = price;} //mutators
	private void setMaxElevation(double maxElevation) {this.maxElevation = maxElevation;}
	
	public Aircraft() { //default constructor
		super();
		this.setPrice(-1d);
		this.setMaxElevation(-1d);
	}
	
	public Aircraft(double price, double maxElevation) { //param. constructor
		super();
		this.setPrice(price);
		this.setMaxElevation(maxElevation);
	}
	
	public Aircraft(Aircraft aircraftObj) { //copy constructor
		this.setPrice(aircraftObj.getPrice());
		this.setMaxElevation(aircraftObj.getMaxElevation());
	}
	
	public String toString() {
		String returnString = "This "+this.getClass().getSimpleName()+" costs $"+this.price+" and has a maximum elevation of "+this.maxElevation+" km.\n"; //this.getClass().getSimpleName() returns the dynamic type of the object.
		return returnString;
	}
	
	public boolean equals(Object obj) {
		if (obj.getClass()==null) {return false;}
		if (obj.getClass()!=this.getClass()) {return false;}
		
		Aircraft aircraftObj = (Aircraft)obj;
		
		if ((aircraftObj.getPrice()==this.price)&&(aircraftObj.getMaxElevation()==this.maxElevation)) {return true;} //if all local variables match, equals returns true
		else {return false;}
	}
}
