package org.example.week9.d5.e1;

public class E1FinalKeyword {

    public static void main(String[] args){

        StringManipulator string = new StringManipulator("hello");
        String reversed = string.reverseString();
        System.out.println(reversed);

        ArrayManipulator arr = new ArrayManipulator();
        int[] num = {3,4,5,6,6};
        arr.avgElements(num);

        // Step 1: Create a `StringManipulator` class with the following:
        // Declare an instance variable str to store a string.
        // Initialize the str variable through the constructor.
        // Create a final method named reverseString that takes no parameters.This method should return the reverse of the string stored in the str variable.
        // Step 2: Create the ArrayManipulator.java class with the following:
        // Create a final method named avgElements that accepts an integer array.The method should calculate and return the average of the array's elements.
        // Step 3: In the E1FinalKeyword class,Main class,Create an object of the StringManipulator class and call the reverseString method.
        // Create an object of the ArrayManipulator class and call the avgElements method.Print the output to verify that all methods are being called correctly

    }

}
