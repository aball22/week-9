package org.example.week9.d2.e1;

public class Building {
    private String location;

    public Building(String location) {
        this.location = location;
    }
    public String getLocation(){
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public Building() {
        System.out.println("Building Constructor");
    }
}
