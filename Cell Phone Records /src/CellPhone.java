
// ----------------------------------------------------------------
//Assignment 4
// Written by: Nesrine Larbi 40079008
// COMP 249 (Section D)
// -----------------------------------------------------------------

import java.util.Objects;


/*
 * CellPhone class has the following attributes: a serialNum (long type), a brand (String type), a year (int type, which 
indicates manufacturing year) and a price (double type). It is assumed that brand name is always recorded as a single word (i.e. 
Motorola, SonyEricsson, Panasonic, etc.). It is also assumed that all cellular phones follow one system of assigning serial numbers, 
regardless of their different brands, so no two cell phones may have the same serial number. 
 */

public class CellPhone {
    private long serialNum;//unique
    private String brand;//one word
    private int year;//manufacturing year
    private double price;

    /**
     * parametrized constructor
     * 
     */
    public CellPhone(long serialNum, String brand,  double price,int year) {
        this.serialNum = serialNum;
        this.brand = brand;
        this.year = year;
        this.price = price;
    }
    
    /**
     * copy constructor
     * @param cell and serial
     */

    public CellPhone(CellPhone cell, long serial)
    {
        this.serialNum = serial;
        this.brand = cell.brand;
        this.year = cell.year;
        this.price = cell.price;
        
    }
// set serial number

    public void setSerialNum(long serialNum) {
        this.serialNum = serialNum;
    }


     // set brand

    
    public void setBrand(String brand) {
        this.brand = brand;
    }


   // set year

    public void setYear(int year) {
        this.year = year;
    }


    // * set price

    public void setPrice(double price) {
        this.price = price;
    }
    
    // get serial number

    public long getSerialNum() {
        return serialNum;
    }

    // get brand
    public String getBrand() {
        return brand;
    }

    /// get year

    public int getYear() {
        return year;
    }


     // get price

    public double getPrice() {
        return price;
    }



     // equals method compares two cellPhone objects
     // @param obj
     // @return boolean

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CellPhone other = (CellPhone) obj;
        if (this.year != other.year) {
            return false;
        }
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (!Objects.equals(this.brand, other.brand)) {
            return false;
        }
        return true;
    }
//clones a cellphone object

    public Object clone()
    {
        return null;
    }
    /**
     * toString method returns a String containing the data of a cellohone
     */
    @Override
    public String toString() {
        return "[" + serialNum + ": " + brand + " " + price+"$ "+year+"]";
    }
    
    
    
    
}
