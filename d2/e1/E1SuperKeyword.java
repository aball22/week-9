package org.example.week9.d2.e1;

public class E1SuperKeyword {
    public static void main(String[] args) {

        House house = new House("Vienna");
        System.out.println(house.getLocation());

        // Step 1: Create a `Building` class with a default constructor and a parameterized constructor to print the location.
        // Step 2: Create a `House` class that extends `Building` and uses `super` in its constructor to call the parent constructor.
        // Step 3: Test by creating a `House` object with a location, verifying that it triggers the `Building` constructor.
        // Step 4: Run and check the output to ensure the location is printed correctly, demonstrating constructor chaining.

    }
}

