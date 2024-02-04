// -----------------------------------------------------
// COMP249
// Assignment 2
// Part 1
// Written by: 
// -----------------------------------------------------

package MetroPackage;

import trainTramPackage.Train;

/**
 *'Metro' has numOfStops(int).
 *Extends 'Train' class.
 */
public class Metro extends Train{

	private int numOfStops;
	
	public int getNumOfStops() {int returnInt = this.numOfStops; return returnInt;} //accessor
	
	private void setNumOfStops(int num) {this.numOfStops = num;} //mutator
	
	public Metro() { //default constructor
		super();
		this.setNumOfStops(-1);
	}
	
	public Metro(int numOfWheels, double maxSpeed, int numOfVehicles, String startingStationName, String destinationStationName, int numOfStops) { //param. constructor
		super(numOfWheels, maxSpeed, numOfVehicles, startingStationName, destinationStationName);
		this.setNumOfStops(numOfStops);
	}
	
	public Metro(Metro metroObj) { //copy constructor
		super(metroObj);
		this.setNumOfStops(metroObj.getNumOfStops());
	}
	
	public String toString() {
		String returnString = super.toString();
		returnString += "It has "+this.numOfStops+" stops.\n";
		return returnString;
	}
	
	public boolean equals(Object obj) {
		if (obj.getClass()==null) {return false;}
		if (obj.getClass()!=this.getClass()) {return false;}
		
		Metro metroObj = (Metro)obj;
		
		if (!super.equals(metroObj)) {return false;}
		
		if (metroObj.getNumOfStops()==this.numOfStops) {return true;} //if all local variables match, equals returns true
		else {return false;}
	}
	
}
