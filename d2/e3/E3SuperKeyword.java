package org.example.week9.d2.e3;

public class E3SuperKeyword {
    public static void main(String[] args) {

        WashingMachine obj1 = new WashingMachine();

        WashingMachine obj2 = new WashingMachine(500,7);
        // Step 1: Create an `Appliance` class with a no-argument constructor and a parameterized constructor for wattage.
        // Step 2: Create a `WashingMachine` class that extends `Appliance` with its own constructors.
        // Step 3: Use `super()` in `WashingMachine` to call the `Appliance` constructor for chaining.
        // Step 4: Test by creating `WashingMachine` objects and verify constructor chaining and overloading.

    }
}
