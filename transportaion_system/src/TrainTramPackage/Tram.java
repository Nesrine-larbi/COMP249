// -----------------------------------------------------
// COMP249
// Assignment 2
// Part 1
// Written by: 
// -----------------------------------------------------

package TrainTramPackage;

import metroPackage.Metro;

/**
 *'Tram' has yearOfCreation(int).
 *Extends 'Metro' class.
 */
public class Tram extends Metro{
	
	private int yearOfCreation;

	public int getYearOfCreation() {int returnInt = this.yearOfCreation; return returnInt;} //accessor
	
	private void setYearOfCreation(int year) {this.yearOfCreation =  year;} //mutator
	
	public Tram() { //default constructor
		super();
		this.setYearOfCreation(-1);
	}
	
	public Tram(int numOfWheels, double maxSpeed, int numOfVehicles, String startingStationName, String destinationStationName, int numOfStops, int yearOfCreation) { //param. constructor
		super(numOfWheels, maxSpeed, numOfVehicles, startingStationName, destinationStationName, numOfStops);
		this.setYearOfCreation(yearOfCreation);
	}
	
	public Tram(Tram tramObj) { //copy constructor
		super(tramObj);
		this.setYearOfCreation(tramObj.getYearOfCreation());
	}
	
	public String toString() {
		String returnString = super.toString(); 
		returnString += "It was made in " + this.yearOfCreation + ".\n";
		return returnString;
	}
	
	public boolean equals(Object obj) {
		if (obj.getClass()==null) {return false;}
		if (obj.getClass()!=this.getClass()) {return false;}
		
		Tram tramObj = (Tram)obj;
		
		if (!super.equals(tramObj)) {return false;}
		
		if (tramObj.getYearOfCreation()==this.yearOfCreation) {return true;} //if all local variables match, equals returns true
		else {return false;}
	}
}
