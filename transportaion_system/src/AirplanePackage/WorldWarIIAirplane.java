// -----------------------------------------------------
// COMP249
// Assignment 2
// Part 1
// Written by: Nesrine larbi Id:70097007
// -----------------------------------------------------

package AirplanePackage;

/**
 *'WorldWarIIAirplane' has twinEngine(boolean).
 *Extends 'Aircraft' class.
 */
public class WorldWarIIAirplane extends Aircraft{

	private boolean twinEngine;
	
	public boolean getTwinEngine() {boolean returnBoolean = this.twinEngine; return returnBoolean;} //accessor
	
	private void setTwinEngine(boolean twinEngine) {this.twinEngine = twinEngine;} //mutator
	
	public WorldWarIIAirplane() { //default constructor
		super();
		this.setTwinEngine(false);
	}
	
	public WorldWarIIAirplane(double price, double maxElevation, boolean twinEngine) { //param. constructor
		super(price, maxElevation);
		this.setTwinEngine(twinEngine);
	}
	
	public WorldWarIIAirplane(WorldWarIIAirplane worldWarIIAirplaneObj) { //copy constructor
		super(worldWarIIAirplaneObj);
		this.setTwinEngine(worldWarIIAirplaneObj.getTwinEngine());
	}
	
	public String toString() {
		String returnString = super.toString();
		returnString += twinEngine?"It has a twin engine.":"It does not have a twin engine.\n";
		return returnString;
	}
	
	public boolean equals(Object obj) {
		if (obj.getClass()==null) {return false;}
		if (obj.getClass()!=this.getClass()) {return false;}
		
		WorldWarIIAirplane worldWarIIAirplaneObj = (WorldWarIIAirplane)obj;
		
		if (!super.equals(worldWarIIAirplaneObj)) {return false;}
		
		if (worldWarIIAirplaneObj.getTwinEngine()==this.twinEngine) {return true;} //if all local variables match, equals returns true
		else {return false;}
	}
}
