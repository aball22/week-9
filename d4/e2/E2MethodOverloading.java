package org.example.week9.d4.e2;

import java.text.DecimalFormat;

public class E2MethodOverloading {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("0.00");

        LoanPaymentCalculator calculator1 = new LoanPaymentCalculator();
        System.out.println(df.format(calculator1.calculatePayment(10000,5)));

        LoanPaymentCalculator calculator2 = new LoanPaymentCalculator();
        System.out.println(df.format(calculator2.calculatePayment(10000,5,24)));

        LoanPaymentCalculator calculator3 = new LoanPaymentCalculator();
        System.out.println(df.format(calculator3.calculatePayment(10000,5,24,2000)));
        // Step 1: Create a `LoanPaymentCalculator` class with a  overloaded methods with name `calculatePayment` with two double parameters:the loan amount and the annual interest rate.Implement logic to calculate the monthly payment assuming a fixed 12-month term. Use the formula: payment = payment = (loanAmount * (1 + interestRate / 100)) / 12.
        // Create an overloaded method named calculatePayment that accepts three double parameters: the loan amount, the annual interest rate, and the number of months for the loan term.Implement logic to calculate the monthly payment using the formula: payment = (loanAmount * (1 + interestRate / 100)) / numberOfMonths.
        // Create another overloaded method named calculatePayment that accepts four double parameters: the loan amount, the annual interest rate, the number of months for the loan term, and the down payment.Implement logic to calculate the monthly payment using the formula: payment = ((loanAmount - downPayment) * (1 + interestRate / 100)) / numberOfMonths.
        // Step 2: In the main class, create a `LoanPaymentCalculator` object, call `calculatePayment` with different parameters and verify it prints results of each loan payment calculation.

    }
}

