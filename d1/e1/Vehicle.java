package org.example.week9.d1.e1;

public class Vehicle {
    private String make;
    private int year;

    public Vehicle(String make, int year) {
        this.make = make;
        this.year = year;
    }
    public void displayInfo(){
        System.out.println("Vehicle: " + make + ", Year: " + year);
    }
}
