package com.T5;

import java.lang.Math.*;

public class CircleFromSimpleGeometricObject extends GeometricObject{

    private double radius;

    public CircleFromSimpleGeometricObject() {
        super();
    }

    public CircleFromSimpleGeometricObject(String color, boolean filled){
        super(color, filled);
    }

    public CircleFromSimpleGeometricObject(double radius) {
        super();
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 2 * this.radius * Math.PI;
    }

    public double getDiameter() {
        return 2 * this.radius;
    }

    public void printCircle() {
        System.out.println();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
