package org.example.week9.d1.e3;

public class CheckingAccount extends  BankAccount{
    private double overdraftLimit;

    public CheckingAccount(String accountHolderName,double balance, String accountNumber, double overdraftLimit){
        super(accountHolderName, balance, accountNumber);
        this.overdraftLimit = overdraftLimit;
    }
    public double getOverdraftLimit() {
        return overdraftLimit;
    }
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
    public void withdraw(double amount) {
        if (getBalance() - amount >= overdraftLimit) {
            super.withdraw(amount);
        }else {
            System.out.println("Error: Overdraft Limit Exceeded");
        }
    }
}
