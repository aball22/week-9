package org.example.week9.d2.e4;

public class E4SuperKeyword {
    public static void main(String[] args) {

        Dog obj = new Dog();
        obj.displaySound();

        // Step 1: Create an `Animal` class with a `sound` variable initialized to a generic animal sound.
        // Step 2: Create a `Dog` class that extends `Animal`, shadows the `sound` variable with "Bark,"and includes a `displaySound` method to show both `sound` values using `super`.
        // Step 3: Test by creating a `Dog` object, calling `displaySound`, and verifying the output shows the shadowed variable and the parent variable.

    }
}
