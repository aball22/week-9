package org.example.week9.d5.e2;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        displayArea();
        return Math.PI * radius * radius;
    }
}
