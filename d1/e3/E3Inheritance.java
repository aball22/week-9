package org.example.week9.d1.e3;

public class E3Inheritance {
    public static void main(String[] args) {
        // Step 1: Create a `BankAccount` class with `accountHolderName`, `balance`, and `accountNumber`, and methods for deposit, withdraw, and printing details.
// Step 2: Extend `BankAccount` with a `SavingsAccount` class, adding an `interestRate` and a method to apply interest to the balance.
// Step 3: Extend `BankAccount` with a `CheckingAccount` class, adding an `overdraftLimit` and overriding the `withdraw` method for overdraft handling.
// Step 4: Test both account types in the `E151Inheritance` class by performing deposits, withdrawals, interest application, and printing details.

        SavingsAccount savings = new SavingsAccount("John Doe", 900.0, "123456789",0.05);
        savings.deposit(100.0);
        savings.applyInterest();
        savings.printAccountInfo();
        System.out.println();

        CheckingAccount checking = new CheckingAccount("Jane Smith", 100.00, "987654321",-50.0);
        checking.withdraw(150.0);
        checking.printAccountInfo();

}
}
