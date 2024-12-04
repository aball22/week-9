package org.example.week9.d4.e1;

public class E1MethodOverloading {


    public static void main(String[] args) {

        TransactionCalculator calculator1 = new TransactionCalculator();
        calculator1.totalRevenue = 120;
        System.out.println(calculator1.calculateProfit(100,20,30,10));

        TransactionCalculator calculator2 = new TransactionCalculator();
        calculator2.totalRevenue = 100;
        System.out.println(calculator2.calculateProfit(80,30,20));

        TransactionCalculator calculator3 = new TransactionCalculator();
        calculator3.totalRevenue = 60;
        System.out.println(calculator3.calculateProfit(50,30));
        // Step 1: Create a `TransactionCalculator` class with 3 methods with name `calculateProfit`,one with two int parameters ,second one with three
        // int parameters and third one with 4 int parameters which represents profits are different transactions and Implement logic to subtract the
        // cost of the transactions from the total revenue and return the result .
        // Step 2: In the main class, create a `TransactionCalculator` object, call `calculateProfit` with different parameters and verify it prints the correct profit calculation.
    }
}



