package org.example.week9.d4.e6;

public class Cat extends Animal {
    public Cat(){
        super("Cat");
    }
    protected void sleep() {
        System.out.println("Cat sleeps a lot");
    }
    void makeSound() {
        System.out.println("Cat makes a sound");
    }
    public void eat() {
        System.out.println("Cat eats");
    }
}
