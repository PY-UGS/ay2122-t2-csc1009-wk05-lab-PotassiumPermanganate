package com.T5;

import java.util.Date;

public class GeometricObject {

    private String color = "white";
    private boolean filled = false;
    private Date dateCreated;

    public GeometricObject(){
        this.dateCreated = new Date();
    }

    public GeometricObject(String color, boolean filled){

        this.color = color;
        this.filled = filled;

    }

    public String toString(){
        return "created on " + this.getDateCreated() + "\n"
                + "color: " + this.getColor() + " and filled: " + this.isFilled();
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
