
package MotorPH_Application;

public class Inventory {
    /**
     This is the class for inventory of the products of MotorPH
     * In here we can insert, delete and update things in the table
     * ----Inventory Class----
     */
    public String _model;
    public String _brand;
    public String _carNumber;
    public int _availableUnits;

    public Inventory (String model, String brand, String number, int units ){
        _model = model;
        _brand = brand;
        _carNumber = number;
        _availableUnits = units;
    
    }
    
    
 
}

 
            

