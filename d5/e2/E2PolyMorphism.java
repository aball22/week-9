package org.example.week9.d5.e2;

import java.text.DecimalFormat;

public class E2PolyMorphism {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");

        Shape[] shape = new Shape[2];
        shape[0] = new Circle(5);
        shape[1] = new Rectangle(4,6);

        for (Shape shapes : shape) {
            System.out.println(df.format(shapes.calculateArea()));
        }
        // Step 1: Create an abstract class called Shape with the following:
        // An abstract method calculateArea() that returns a double
        // A non-abstract method displayArea() that prints "The area of the shape is: [area]"
        // Create a class Circle that extend Shape:
        // Has a private instance variable radius (double).Implement the calculateArea() method to return the area of the circle (π * r^2)
        // Create a class Rectangle that extend Shape:
        // Has private instance variables width and height (both double).Implement the calculateArea() method to return the area of the rectangle (width * height)
        // Add constructors to Circle and Rectangle classes to initialize their respective instance variables.
        // Step 3: In the E2PolyMorphism  class,Main class,Create an array of Shape objects containing at least one Circle and one Rectangle.
        // Iterate through the array and call the displayArea() method for each shape.Print the output to verify that all methods are being called correctly

    }
}
