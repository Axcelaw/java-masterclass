package com.walace.ex35;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius > 0 ? radius : 0;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.pow(getRadius(), 2) * Math.PI;
    }
}
