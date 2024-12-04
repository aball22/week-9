package org.example.week9.d2.e4;

public class Dog extends Animal {
    public String sound = "Bark";

    public void displaySound() {
        System.out.println(sound);
        System.out.println(super.sound);
    }
}
