// -----------------------------------------------------
// COMP249
// Assignment 2
// Part 1
// Written by: 
// -----------------------------------------------------

package MonowheelPackage;

import wheeledTransportationPackage.WheeledTransportation;

/**
 *'Monowheel' has maxWeight(double).
 *Extends 'WheeledTransportation' class.
 */
public class Monowheel extends WheeledTransportation{

	private double maxWeight;
	
	public double getMaxWeight() {double returnDouble = this.maxWeight; return returnDouble;} //accessor
	
	private void setMaxWeight(double maxWeight) {this.maxWeight = maxWeight;} //mutator
	
	public Monowheel() { //default constructor
		super();
		this.setMaxWeight(-1d);
	}
	
	public Monowheel(int numOfWheels, double maxSpeed, double maxWeight) { //param. constructor
		super(numOfWheels, maxSpeed);
		this.setMaxWeight(maxWeight);
	}
	
	public Monowheel(Monowheel monowheelObj) { //copy constructor
		super(monowheelObj);
		this.setMaxWeight(monowheelObj.getMaxWeight());
	}
	
	public String toString() {
		String returnString = super.toString();
		returnString += "It has a maximum weight of "+this.maxWeight+" lbs.\n";
		return returnString;
	}
	
	public boolean equals(Object obj) {
		if (obj.getClass()==null) {return false;}
		if (obj.getClass()!=this.getClass()) {return false;}
		
		Monowheel monowheelObj = (Monowheel)obj;
		
		if (!super.equals(monowheelObj)) {return false;}
		
		if (monowheelObj.getMaxWeight()==this.maxWeight) {return true;} //if all local variables match, equals returns true
		else {return false;}
	}
	
}
