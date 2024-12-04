package org.example.week9.d4.e1;

public class TransactionCalculator {
    int totalRevenue;
    public int calculateProfit(int t1, int t2) {
        int result = (t1 + t2) - totalRevenue;
        return result;
    }
    public int calculateProfit(int t1, int t2, int t3) {
        int result = (t1 + t2 + t3) - totalRevenue;
        return result;
    }
    public int calculateProfit(int t1, int t2, int t3, int t4) {
        int result = (t1 + t2 + t3 + t4) - totalRevenue;
        return result;
    }
}
