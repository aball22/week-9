package org.example.week9.d4.e5;

public class Developer extends Employee {
    public void work() {
        System.out.println("I am a Developer working");
    }
    protected void takeBreak() {
        System.out.println("I am a Developer taking a break");
    }
    void attendMeeting() {
        System.out.println("I am a Developer attending a meeting");
    }
    public void hello() {
        System.out.println("method in Developer class");
    }
}