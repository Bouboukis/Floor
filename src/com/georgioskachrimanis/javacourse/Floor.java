package com.georgioskachrimanis.javacourse;

public class Floor {

    private double width, length;

    // constructors

    public Floor(double width, double length) {
        this.width = width;
        if (width < 0) {
            this.width = 0;
        }

        this.length = length;
        if (length < 0) {
            this.length = 0;
        }
    }

    // setters and getters

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
        if (width < 0) {
            this.width = 0;
        }
    }

    public void setLength(double length) {
        this.length = length;
        if (length < 0) {
            this.length = 0;
        }
    }

    // methods

    public double getArea() {
        return (getWidth() * getLength());
    }
}
