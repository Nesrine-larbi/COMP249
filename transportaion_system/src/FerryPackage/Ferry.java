// -----------------------------------------------------
// COMP249
// Assignment 2
// Part 1
// Written by: 
// -----------------------------------------------------

package FerryPackage;

import vehiclePackage.Vehicle;

/**
 *'Ferry' has maxSpeed(double), maxLoad(double).
 *Extends 'Vehicle' class.
 */
public class Ferry extends Vehicle{
	
	private double maxSpeed;
	private double maxLoad;
	
	public double getMaxSpeed() {double returnDouble = this.maxSpeed; return returnDouble;} //accessors
	public double getMaxLoad() {double returnDouble = this.maxLoad; return returnDouble;}
	
	private void setMaxSpeed (double maxSpeed) {this.maxSpeed = maxSpeed;} //mutators
	private void setMaxLoad(double maxLoad) {this.maxLoad = maxLoad;}
	
	public Ferry() { //default constructor
		super();
		this.setMaxSpeed(-1d);
		this.setMaxLoad(-1d);
	}
	
	public Ferry(double maxSpeed, double maxLoad) { //param. constructor
		super();
		this.setMaxSpeed(maxSpeed);
		this.setMaxLoad(maxLoad);
	}
	
	public Ferry(Ferry ferryObj) { //copy constructor
		this.setMaxSpeed(ferryObj.getMaxSpeed());
		this.setMaxLoad(ferryObj.getMaxLoad());		
	}
	
	public String toString() {
		String returnString = "This " + this.getClass().getSimpleName() + " has a maximum speed of "+this.maxSpeed + " km/hr and a maximum load of "+this.maxLoad+" tons.\n"; //this.getClass().getSimpleName() returns the dynamic type of the object.
		return returnString;
	}
	
	public boolean equals(Object obj) {
		if (obj.getClass()==null) {return false;}
		if (obj.getClass()!=this.getClass()) {return false;}
		
		Ferry ferryObj = (Ferry)obj;
		
		if ((ferryObj.getMaxSpeed()==this.maxSpeed)&&(ferryObj.getMaxLoad()==this.maxLoad)) {return true;} //if all local variables match, equals returns true
		else {return false;}
	}

}
