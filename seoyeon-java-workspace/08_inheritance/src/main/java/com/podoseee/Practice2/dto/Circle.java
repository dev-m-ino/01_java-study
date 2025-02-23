package com.podoseee.Practice2.dto;

import static java.lang.Math.PI;

public class Circle extends Point{
    private static int radius;

    public Circle(){}

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public static int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public static void draw(){
        System.out.println("x좌표 : " + getX() + "y좌표 : " + getY());
        System.out.println("면적 : " + PI*getRadius()*getRadius());
        System.out.println("둘레 : " + PI*getRadius()*2);
    }
}
