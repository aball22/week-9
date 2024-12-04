package org.example.week9.d4.e2;

public class LoanPaymentCalculator {
    double calculatePayment(double loanAmount, double interestRate){
        double payment = (loanAmount * (1 + interestRate / 100)) / 12;
        return payment;
    }
    double calculatePayment(double loanAmount, double interestRate, double numberOfMonths) {
        double payment = (loanAmount * (1 + interestRate / 100)) / numberOfMonths;
        return payment;
    }
    double calculatePayment(double loanAmount, double interestRate, double numberOfMonths, double downPayment) {
        double payment = ((loanAmount - downPayment) * (1 + interestRate / 100)) / numberOfMonths;
        return payment;
    }
}
