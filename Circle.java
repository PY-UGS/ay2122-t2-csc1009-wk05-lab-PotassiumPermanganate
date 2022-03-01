package com.T5;

public class Circle extends Shape{

    public Circle(double r, double r2) {
        super(r,r2);
    }

    @Override
    public double area() {
        return super.PI * super.getDim1() * super.getDim2();
    }
}
