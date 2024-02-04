// -----------------------------------------------------
// COMP249
// Assignment 2
// Part 1
// Written by: 
// -----------------------------------------------------

package WheeledTransportationPackage;

import vehiclePackage.Vehicle;

/**
 *'WheeledTransportation' has numOfWheels(int) and maxSpeed(double).
 *Extends 'Vehicle' class.
 */
public class WheeledTransportation extends Vehicle{

	private int numOfWheels;
	private double maxSpeed;
	
	public int getNumOfWheels() {int returnInt = this.numOfWheels; return returnInt;} //accessors
	public double getMaxSpeed() {double returnDouble = this.maxSpeed; return returnDouble;}
	
	private void setNumOfWheels(int numOfWheels) {this.numOfWheels = numOfWheels;} //mutators
	private void setMaxSpeed(double maxSpeed) {this.maxSpeed = maxSpeed;}
	
	
	public WheeledTransportation() { //default constructor
		super();
		this.setNumOfWheels(-1);
		this.setMaxSpeed(-1d);
	}
	
	public WheeledTransportation(int numOfWheels, double maxSpeed) { //param. constructor
		super();
		this.setNumOfWheels(numOfWheels);
		this.setMaxSpeed(maxSpeed);
	}
	
	public WheeledTransportation(WheeledTransportation wtObj) { //copy constructor
		this.setNumOfWheels(wtObj.getNumOfWheels());
		this.setMaxSpeed(wtObj.getMaxSpeed());
	}
	
	public String toString() {
		String returnString = "This "+this.getClass().getSimpleName()+ " has " + this.numOfWheels + " wheels, and a maximum speed of " + this.maxSpeed + " km/hr.\n"; //this.getClass().getSimpleName() returns the dynamic type of the object.
		return returnString;
	}
	
	public boolean equals(Object obj) {
		if (obj.getClass()==null) {return false;}
		if (obj.getClass()!=this.getClass()) {return false;}
		
		WheeledTransportation wtObj = (WheeledTransportation)obj;
		
		if (((wtObj).getNumOfWheels()==this.numOfWheels)&&((wtObj).getMaxSpeed()==this.maxSpeed)) {return true;} //if all local variables match, equals returns true
		else {return false;}
	}
	
}
