package nesrine_hw2;

import airplanePackage.Aircraft;
import airplanePackage.WorldWarIIAirplane;
import ferryPackage.Ferry;
import metroPackage.Metro;
import monowheelPackage.Monowheel;
import trainTramPackage.Train;
import trainTramPackage.Tram;
import vehiclePackage.Vehicle;
import wheeledTransportationPackage.WheeledTransportation;

/**
 *
 * @author admin
 */
public class test {

    /**
 * 'Driver' creates 'Vehicle' arrays and displays their information. It also displays equals() checks and findLeastAndMostExpensiveAircraft() results.
 */

	public static void main(String[] args) {

		Vehicle[] vehicleArray = new Vehicle[16]; //reate at least 16 objects from the 8 classes
		
		vehicleArray[0] = new WheeledTransportation(4, 150d);
		vehicleArray[1] = new WheeledTransportation(2, 40d);
		vehicleArray[2] = new Train(10, 200d, 2, "Ottawa", "Casselman");
		vehicleArray[3] = new Train(40, 400d, 10, "Tokyo", "Kyoto");
		vehicleArray[4] = new Metro(18, 80d, 9, "Angrignon", "HonorÃ©-Beaugrand", 27);
		vehicleArray[5] = new Metro(18, 80d, 9, "Berri-UQAM", "Longeuil-UniversitÃ©-De-Sherbrooke", 3);
		vehicleArray[6] = new Tram(8, 100d, 3, "High Park Loop", "Main Street", 4, 1987);
		vehicleArray[7] = new Tram(8, 100d, 3, "Long Branch Loop", "Newville Park Loop", 5, 1999);
		vehicleArray[8] = new Monowheel(1, 30.5d, 200d);
		vehicleArray[9] = new Monowheel(1, 30.5d, 200d);		
		vehicleArray[10] = new Ferry(55.5d, 16d);
		vehicleArray[11] = new Ferry(55.5d, 16d);
		vehicleArray[12] = new Aircraft(40000.00d, 13.5d);
		vehicleArray[13] = new Aircraft(1000000.00d, 15.3d);
		vehicleArray[14] = new WorldWarIIAirplane(3000000.00d, 10.1d, false);
		vehicleArray[15] = new WorldWarIIAirplane(5000000.00d, 12.2d, true);
		
		for (int i = 0; i<vehicleArray.length; i++) { //Display the information of these objects with toString()
System.out.println("");
System.out.println("Vehicle "+(i+1)+".");
			System.out.println("----------------------");
			System.out.println(vehicleArray[i].toString()); //toString() used
		}
		
		System.out.println();
            System.out.println("");		
		for (int i = 0; i<vehicleArray.length; i=i+2) {//Test the equality of the objects created using the equals() method. Checks two objects from the same class with different values and two objects with similar values. 
			if (vehicleArray[i].equals(vehicleArray[i+1])) {System.out.println("Vehicles "+(i+1)+" and "+(i+2)+" are IDENTICAL.");} //checks equals(), prints confirmation message if true.
			else {System.out.println("Vehicles "+(i+1)+" and "+(i+2)+" are DIFFERENT.");} //prints message indicative of object difference if false.
		}
		
		for (int i = 0; i<vehicleArray.length; i=i+4) { //Same equals() check as above, tests objects of different classes.
			if (vehicleArray[i].equals(vehicleArray[i+3])) {System.out.println("Vehicles "+(i+1)+" and "+(i+4)+" are IDENTICAL.");}
			else {System.out.println("Vehicles "+(i+1)+" and "+(i+4)+" are DIFFERENT.");}
		}
		System.out.println();
            System.out.println("");		
		Vehicle[] vehicleArray2 = new Vehicle[20]; //create an array of 15 to 20 mixed objects, including at least one object from each class.
		
		vehicleArray2[0] = new WheeledTransportation(6, 166d);
		vehicleArray2[1] = new WheeledTransportation(6, 60d);
		vehicleArray2[2] = new Train(20, 300d, 2, "Ottawa", "Vancouver");
		vehicleArray2[3] = new Train(20, 500d, 10, "Montreal", "Toronto");
		vehicleArray2[4] = new Metro(20, 80d, 19, "Station Y", "Station X", 27);
		vehicleArray2[5] = new Metro(18, 87d, 9, "Pizza land", "Ice cream stop", 3);
		vehicleArray2[6] = new Tram(18, 110d, 8, "University", "Downtown", 4, 1997);
		vehicleArray2[7] = new Tram(10, 101d, 4, "Hillside", "Park", 5, 2001);
		vehicleArray2[8] = new Monowheel(1, 36.5d, 200d);
		vehicleArray2[9] = new Monowheel(1, 40.5d, 250d);		
		vehicleArray2[10] = new Ferry(55.5d, 50d);
		vehicleArray2[11] = new Ferry(5.5d, 9.4d);
		vehicleArray2[12] = new Aircraft(90000.00d, 13.5d);
		vehicleArray2[13] = new Aircraft(1000000.00d, 15.3d);
		vehicleArray2[14] = new Aircraft(140000.0d, 11.9d);
		vehicleArray2[15] = new Aircraft(60000.0d, 12.1d);
		vehicleArray2[16] = new Aircraft(4660000.0d, 16.6d);
		vehicleArray2[17] = new WorldWarIIAirplane(3000000.00d, 10.1d, false);
		vehicleArray2[18] = new WorldWarIIAirplane(7770000.00d, 12.7d, true);
		vehicleArray2[19] = new WorldWarIIAirplane(4000000.00d, 11.4d, true);
		
		Vehicle[] vehicleArray3 = new Vehicle[17]; //create an array of 15 to 20 mixed objects, does not have any Aircraft objects.
		
		vehicleArray3[0] = new WheeledTransportation(6, 166d);
		vehicleArray3[1] = new WheeledTransportation(6, 60d);
		vehicleArray3[2] = new WheeledTransportation(2, 220d);
		vehicleArray3[3] = new WheeledTransportation(4, 170d);
		vehicleArray3[4] = new Train(30, 500d, 25, "London", "Beijing");
		vehicleArray3[5] = new Train(26, 200d, 14, "Halifax", "Niagara");
		vehicleArray3[6] = new Train(28, 180d, 15, "New York", "Boston");
		vehicleArray3[7] = new Metro(5, 50d, 8, "Greenborough", "Parliament", 27);
		vehicleArray3[8] = new Tram(12, 40d, 14, "Shore", "Art Museum", 9, 1957);
		vehicleArray3[9] = new Monowheel(1, 36.5d, 200d);
		vehicleArray3[10] = new Monowheel(1, 40.5d, 250d);	
		vehicleArray3[11] = new Monowheel(1, 10.5d, 100d);
		vehicleArray3[12] = new Monowheel(1, 11.5d, 110d);
		vehicleArray3[13] = new Monowheel(1, 12.5d, 122d);
		vehicleArray3[14] = new Ferry(120.1d, 500d);
		vehicleArray3[15] = new Ferry(81.5d, 9.4d);
		vehicleArray3[16] = new Ferry(90.5d, 40.5d);
		
		System.out.println("Result of findLeastAndMostExpensiveAircraft() on vehicleArray2:\n"); //call findLeastAndMostExpensiveAircraft() on array containing at least one of every object
		findLeastAndMostExpensiveAircraft(vehicleArray2); //print result
		
            System.out.println("\n");		
		System.out.println("Result of findLeastAndMostExpensiveAircraft() on vehicleArray3:\n"); //call findLeastAndMostExpensiveAircraft() on array containing at least one of every object
		findLeastAndMostExpensiveAircraft(vehicleArray3); //print result
		
	}
	
	/**
	 * Prints information on 'Aircraft' objects that have the lowest and highest price.
	 * @param vehicleArray array of vehicles which will be checked.
	 */
	static void findLeastAndMostExpensiveAircraft(Vehicle[] vehicleArray) {
		
		boolean foundAircraft = false;
		Aircraft leastExpensiveAircraft = null;
		Aircraft mostExpensiveAircraft = null;
		
		int leastExpensiveAircraftIndex = -1; //use to track where the significant Aircrafts are located in the array, since Vehicle objects hold no unique indentifiers.
		int mostExpensiveAircraftIndex = -1;
		
		for (int i = 0; i<vehicleArray.length; i++) { //run through every object passed in Vehicle array
			if ((vehicleArray[i].getClass().getPackage().toString().equals("package airplanePackage"))) { // checks if object is part of the airplanePackage package (either an Aircraft object or a child of Aircraft).
				if (!foundAircraft) { //if no other aircrafts have been found, the least and most expensive aircrafts are both set to this object
					leastExpensiveAircraft = (Aircraft)vehicleArray[i];
					leastExpensiveAircraftIndex = i; //track where least expensive aircraft was found in the array
					mostExpensiveAircraft = (Aircraft)vehicleArray[i];
					mostExpensiveAircraftIndex = i;
					foundAircraft = true;
				} else {
				//if we have found an Aircraft but it's not the first, check if it is less or more expensive than what was found before. Reset reference if necessary. Update aircraft number as well.
				if (((Aircraft)vehicleArray[i]).getPrice()<leastExpensiveAircraft.getPrice()) {leastExpensiveAircraft = ((Aircraft)vehicleArray[i]); leastExpensiveAircraftIndex = i;}
				if (((Aircraft)vehicleArray[i]).getPrice()>mostExpensiveAircraft.getPrice()) {mostExpensiveAircraft = ((Aircraft)vehicleArray[i]); mostExpensiveAircraftIndex = i;}
				}
				
			}
		}
		
		if (!foundAircraft) {System.out.println("No aircraft found.");} //if no aircrafts were found in array, display as such.
		else { //else at least one aircraft was found, display information.
			System.out.println("Least expensive aircraft");
			System.out.println("------------------------");
			System.out.println("Vehicle "+(leastExpensiveAircraftIndex+1)+".");
			System.out.println(leastExpensiveAircraft.toString());
			System.out.println("\nMost expensive aircraft");
			System.out.println("------------------------");
			System.out.println("Vehicle "+(mostExpensiveAircraftIndex+1)+".");
			System.out.println(mostExpensiveAircraft.toString());
		}
	}
}

