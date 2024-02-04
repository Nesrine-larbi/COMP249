// ----------------------------------------------------------------
//Assignment 4
// Written by: Nesrine Larbi 40079008
// COMP 249 (Section D)
// -----------------------------------------------------------------

import java.io.FileInputStream;
import java.util.Scanner;


public class CellListUtilization {

	public static void main(String[] args) {
	      
			//open cell info file
	        Scanner reader=null;
	        
	        try{

			//	File Reading
	            reader= new Scanner(new FileInputStream("Cell_Info.txt"));
	            
	            
	        }
	        catch(Exception e)
	        {
	            System.out.println(e.getMessage());
	            System.exit(0);//if opening the file fails, exit 
	        }
	        
	        //create a cell list
	        CellList list1= new CellList();
	        
	        //read from the file and populate the list
	        while(reader.hasNext())
	        {

	            String serial= reader.next();
	            String brand=reader.next();
	            String price=reader.next();
	            String year=reader.next();
	          
	            if(!list1.contains(Long.parseLong(serial)))
	            {
	                list1.addToStart(new CellPhone(Long.parseLong(serial),brand,Double.parseDouble(price),Integer.parseInt(year)));
	            }

	        }//done reading from file
	        
	        reader.close();
	        
	        //display list
	        list1.showContents();
	        
	        //read serial numbers from user and search for them
        int count=0;
	        while(true)
	        {
	        	Scanner scan=new Scanner(System.in);
	            System.out.print("\nEnter serial number to searh for (-1 to stop): ");
	            int serialNum=scan.nextInt();
	            if(serialNum==-1)//stop searching
	            {System.out.println("You have searched for "+count+" serial numbers");
	                break;}
	            else
	            { count++;
	               if(list1.contains(serialNum))//check if list contains the given serial number
	               {
	                   System.out.println("Phone with serial number "+serialNum+" is found");
	                   System.out.println(list1.find(serialNum).getPhone().toString());
	               }
	               else
	                   System.out.println("Phone with serial number "+serialNum+" is not found");
	            }
	            
	                
	        }
	        
	        //testing methods
	        list1.addToStart(new CellPhone(111,"Samsung",920,2020));
	        list1.insertAtIndex(new CellPhone(222, "Nokia",500,2018), 3);
	       
	        
	        System.out.println("\nDisplaying list after adding 2 new phones");
	        list1.showContents();
	        
	        if(list1.contains(111))
	            System.out.println("\nList contains cell phone with serial number 111");
	        else
	            System.out.println("\nList does not contain cell phone with serial number 111");
	        
	        System.out.println("\nDisplaying list after removing phones at indices 3 and 0");
	        list1.deleteFromIndex(3);
	        list1.deleteFromIndex(0);
	        list1.showContents();
	        
	       System.out.println();
	        list1.replaceAtIndex(new CellPhone(333,"Samsung",200,2015), 0);
	        list1.showContents();
	        
	        CellList list2= new CellList(list1);
	        System.out.println("\nDisplaying list2: ");
	        list2.showContents();
	        
	        if(list1.equals(list2))
	        	System.out.println("List 1 and list 2 are equal");
	        else
	        	System.out.println("List 1 and list 2 are not equal");
	        
	        //change a node from list 2
	        list2.replaceAtIndex(new CellPhone(555,"Nokia",800,2020), 2);
	        if(list1.equals(list2))
	        	System.out.println("List 1 and list 2 are equal");
	        else
	        	System.out.println("List 1 and list 2 are not equal");
	        

	        	
	        
	    }
	    
	}
