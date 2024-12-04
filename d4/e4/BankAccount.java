package org.example.week9.d4.e4;

public class BankAccount {
    private void displayInfo() {
        System.out.println("private displayInfo method");
    }
    private void displayInfo(int balance) {
        System.out.println("private displayInfo method with balance: " + balance);
    }
    public static void displayBankInfo() {
        System.out.println("static method without parameter");
    }
    public static void displayBankInfo(int branches) {
        System.out.println("static method with int parameter: " + branches);
    }
    public void callInfo(Integer balance){
        if (balance == null) {
            displayInfo();
        }else {
            displayInfo(balance);
        }
    }
}
