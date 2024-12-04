package org.example.week9.d4.e6;

public class E6MethodOverriding {
    public static void main(String[] args) {

        Cat[] cats = new Cat[4];
        cats[0] = new Cat();
        cats[1] = new Kitten1();
        cats[2] = new Kitten2();
        cats[3] = new Kitten3();

        for (Cat cat : cats) {
            cat.eat();
            cat.sleep();
        }
        Cat cat = new Cat();
        cat.makeSound();
        // Step 1: Create a `Animal` class and with the following :
        // Declare an instance variable type to store the type of animal.
        // Create a constructor to initialize the type instance variable.
        // Create a public method named eat that prints "I am an animal eating".
        // Create a protected method named sleep that prints "I am an animal sleeping".
        // Create a default (package-private) method named makeSound that prints "I am an animal making sound".
        // Create a private method named roam that prints "I am an animal roaming".
        // Step 2: Create the Cat.java class as a subclass of Animal:
        // Override the sleep method to print "Cat sleeps a lot".
        // Override makeSound and eat methods to print "Cat makes a sound" and "Cat eats".
        // Step 3: Create the Kitten1.java, Kitten2.java, and Kitten3.java classes as subclasses of Cat:
        // In Kitten1, override the eat method to print "kitten1 eats milk".
        // In Kitten2, override the eat method to print "kitten2 eats snacks".
        // In Kitten3, override the eat method to print "kitten3 eats everything".
        // Step 4: In the E6MethodOverriding.java class,Main Method:
        // Create an object of the Cat class and objects of Kitten1, Kitten2, and Kitten3 classes and Store these objects in an array of Animal type.
        // Loop through the array and call the eat and sleep methods for each object to demonstrate method overriding.
        // Create an object of the Cat class and call the makeSound method to verify method access and overriding.
        // Print the output to verify that all methods are being called correctly

    }
}
