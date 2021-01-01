package com.walace.ex32;

public class Point {

    private int x;
    private int y;

    public Point() {

    }

    public Point(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2));
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow((getX()-x), 2) + Math.pow((getY()-y), 2));
    }

    public double distance(Point point) {
        return Math.sqrt(Math.pow((getX()-point.getX()), 2) + Math.pow((getY()-point.getY()), 2));
    }
}
