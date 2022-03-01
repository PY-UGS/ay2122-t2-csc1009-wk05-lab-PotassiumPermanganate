package com.T5;

public class Triangle extends Shape{

    public Triangle(double height, double width) {
        super(height, width);
    }

    @Override
    public double area() {
        return super.getDim1() * super.getDim2() * 0.5;
    }
}
