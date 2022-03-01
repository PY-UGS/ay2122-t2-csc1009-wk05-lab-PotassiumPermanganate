package com.T5;

public class Rectangle extends Shape{

    public Rectangle(double height, double width){
        super(height, width);
    }

    @Override
    public double area() {
       return super.getDim1() * super.getDim2();
    }
}
