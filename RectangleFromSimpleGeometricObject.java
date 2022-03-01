package com.T5;

public class RectangleFromSimpleGeometricObject extends GeometricObject{

    private double width, height;

    public RectangleFromSimpleGeometricObject() {
        super();
    }

    public RectangleFromSimpleGeometricObject(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public RectangleFromSimpleGeometricObject(double height, double width,
                                              String color, boolean filled){
        super(color, filled);
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double getPerimeter() {
        return this.height * 2 + this.width * 2;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
