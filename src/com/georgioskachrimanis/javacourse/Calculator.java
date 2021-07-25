package com.georgioskachrimanis.javacourse;

public class Calculator {

    private Floor floor;
    private Carpet carpet;

    //constructor

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }


    // getters and setters
    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    public void setCarpet(Carpet carpet) {
        this.carpet = carpet;
    }

    // methods

    public double getTotalCost() {
        return (floor.getArea() * carpet.getCost());
    }
}
