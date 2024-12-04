package org.example.week9.d1.e1;

public class Car extends Vehicle {
    private String model;

    public Car(String make, int year, String model){
        super(make, year);
        this.model = model;
    }
    public void displayCarInfo() {
        super.displayInfo();
        System.out.println("Model: " + model);
    }
}
