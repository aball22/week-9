package org.example.week9.d2.e3;

public class WashingMachine extends Appliance{
    public WashingMachine() {
        System.out.println("WashingMachine Constructor without argument");
    }
    public WashingMachine(int wattage,int capacity) {
        super(wattage);
        System.out.println("Capacity: " + capacity);
    }
}
