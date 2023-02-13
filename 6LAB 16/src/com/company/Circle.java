package com.company;

public class Circle {
    private Double radius;
    public Circle(double radius)
    {this.radius=radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getPerimetr(){
        return 2*3.14*radius;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
}
