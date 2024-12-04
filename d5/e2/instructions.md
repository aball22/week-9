# Understanding Polymorphism in Java

## Objective
Learn how to implement and use polymorphism in Java by creating a hierarchy of shapes and calculating their areas.

## Instructions

**Implementing Polymorphism**

In this exercise, you will create a base class `Shape` and two derived classes `Circle` and `Rectangle`. You will then use polymorphism to calculate and display the areas of different shapes.

**For you to do:**

1. **Create the Base Class**
   - Create an abstract class called `Shape` with the following:
      - An abstract method `calculateArea()` that returns a `double`
      - A non-abstract method `displayArea()` that prints "The area of the shape is: [area]"

2. **Create Derived Classes**
   - Create two classes that extend `Shape`:
      - `Circle`
         - Has a private instance variable `radius` (double)
         - Implements the `calculateArea()` method to return the area of the circle (π * r^2)
      - `Rectangle`
         - Has private instance variables `width` and `height` (both double)
         - Implements the `calculateArea()` method to return the area of the rectangle (width * height)

3. **Implement Constructors**
   - Add constructors to `Circle` and `Rectangle` classes to initialize their respective instance variables

4. **In the Test Class**
   - In the `E2PolyMorphism` class:
   - In the `main` method:
      - Create an array of `Shape` objects containing at least one `Circle` and one `Rectangle`
      - Iterate through the array and call the `displayArea()` method for each shape

5. **Understand Polymorphism**
   - **What is Polymorphism?**
      - Polymorphism allows objects of different classes to be treated as objects of a common base class.
      - It enables you to write more flexible and reusable code by working with generalized types.

   - **Why Use Polymorphism?**
      - To create modular and extensible code
      - To implement "programming to an interface, not an implementation"
      - To enable runtime method binding, allowing different behaviors based on the actual object type

   - **When to Use Polymorphism:**
      - When you have a hierarchy of related classes that share common behaviors
      - When you want to write code that can work with objects of multiple related types
      - When you need to add new derived classes without modifying existing code

## Example Output
```
The area of the shape is: 78.54 (for a Circle with radius 5)
The area of the shape is: 24.00 (for a Rectangle with width 4 and height 6)
```

## Tips
- Remember to use the `@Override` annotation when implementing the `calculateArea()` method in derived classes.
- Use `Math.PI` for the value of π in your circle area calculation.
- You can use `String.format("%.2f", area)` to format the area to two decimal places in the `displayArea()` method.

## Troubleshooting
- If you get a "cannot instantiate abstract class" error, make sure you're not trying to create an instance of the `Shape` class directly.
- If the `displayArea()` method is not working for all shapes, ensure that the `calculateArea()` method is correctly implemented in each derived class.
- If you're seeing unexpected results, double-check your area calculations in each class.

Happy coding!
