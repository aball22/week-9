package org.example.week9.d6;

public class E1AbstractClass {
    public static void main(String[] args){

        Car car = new Car();
        car.startEngine();
        car.startEngine("a smart key");
        car.stopEngine();
        // Step 1: Create a `Vehicle` class with the following:
        // Declare an abstract method startEngine() with no parameters.
        // Create a non-abstract method stopEngine() that prints "Vehicle engine stopped".
        // Step 2: Create the Car.java class as a subclass of Vehicle:
        // Provide the implementation for the startEngine() method that prints "Car engine started".
        // Create another version of the startEngine() method that takes a String parameter (e.g., keyType) and prints "Car engine started with " followed by the parameter (e.g., "Car engine started with a smart key").
        // Step 3: In the E1AbstractClass, class,Main class,create an object of the Car class.
        // Call both the startEngine() and startEngine(String) methods.
        // Call the stopEngine() method inherited from the Vehicle class.
        // Print the output to verify that all methods are being called correctly

    }
}


