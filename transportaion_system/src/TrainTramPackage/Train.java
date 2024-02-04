// -----------------------------------------------------
// COMP249
// Assignment 2
// Part 1
// Written by: 
// -----------------------------------------------------


package TrainTramPackage;

import wheeledTransportationPackage.WheeledTransportation;

/**
 *'Train' has numOfVehicles(int), startingStationName(String), destinationStationName(String).
 *Extends 'WheeledTransportation' class.
 */
public class Train extends WheeledTransportation{

	private int numOfVehicles;
	private String startingStationName;
	private String destinationStationName;
	
	public int getNumOfVehicles() {int returnInt = this.numOfVehicles; return returnInt;} //accessors
	public String getStartingStationName() {String returnString = this.startingStationName; return returnString;}
	public String getDestinationStationName() {String returnString = this.destinationStationName; return returnString;}

	private void setNumOfVehicles(int numOfVehicles) {this.numOfVehicles = numOfVehicles;} //mutators
	private void setStartingStationName(String name) {this.startingStationName = name;}
	private void setDestinationStationName(String name) {this.destinationStationName = name;}
	
	public Train() { //default constructor.
		super();	
		this.setNumOfVehicles(-1);
		this.setStartingStationName(null);
		this.setDestinationStationName(null);
	}
	
	public Train(int numOfWheels, double maxSpeed, int numOfVehicles, String startingStationName, String destinationStationName) { //param. constructor
		super(numOfWheels, maxSpeed);
		this.setNumOfVehicles(numOfVehicles);
		this.setStartingStationName(startingStationName);
		this.setDestinationStationName(destinationStationName);
	}
	
	public Train(Train trainObj) { //copy constructor
		super(trainObj);
		this.setNumOfVehicles(trainObj.getNumOfVehicles());
		this.setStartingStationName(trainObj.getStartingStationName());
		this.setDestinationStationName(trainObj.getDestinationStationName());
	}
	
	public String toString() {
		String returnString = super.toString();
		returnString += "It has " + this.numOfVehicles + " vehicles and its starting and destination stations are "+this.startingStationName+" and "+this.destinationStationName+".\n";
		return returnString;
	}
	
	public boolean equals(Object obj) {
		if (obj.getClass()==null) {return false;}
		if (obj.getClass()!=this.getClass()) {return false;}
		
		Train trainObj = (Train)obj;
		
		if (!super.equals(trainObj)) {return false;}
		
		if ((trainObj.getNumOfVehicles()==this.numOfVehicles)&&(trainObj.getStartingStationName()==this.startingStationName)&&(trainObj.getDestinationStationName()==this.destinationStationName)) {return true;} //if all local variables match, equals returns true
		else {return false;}
	}
}