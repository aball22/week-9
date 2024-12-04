package org.example.week9.d4.e4;

public class E4MethodOverloading {
    public static void main(String[] args) {

        BankAccount obj = new BankAccount();

        obj.callInfo(null);

        obj.callInfo(5000);

        BankAccount.displayBankInfo();

        BankAccount.displayBankInfo(20);

        // Step 1: Create a `BankAccount` class and create the following methods
        // Create a private instance method named displayInfo with no parameters and prints "private displayInfo method".
        // Create an overloaded private instance method named displayInfo that accepts an int parameter representing the account balance and prints "private displayInfo method with balance: " followed by the balance.
        // Create a static method named displayBankInfo with no parameters and prints "static method without parameter".
        // Create an overloaded static method named displayBankInfo that accepts an int parameter representing the number of bank branches and prints "static method with int parameter: " followed by the branches.
        // Step 2: In the main class, create a `BankAccount ` object.
        // Call the first displayInfo method (with no parameters) using the object.
        // Call the overloaded displayInfo method (with an int parameter) using the object.
        // Directly call the first displayBankInfo method (with no parameters) using the class name.
        // Call the overloaded displayBankInfo method (with an int parameter) using the class name.
        // Print the output to verify that all methods are being called correctly

    }
}


