package com.company;

public class Square
{
    private double side;
    public Square(double side)
    {
        this.side = side;
    }

    public double getSide()
    {
        return side;
    }

    public double getPerimeter()
    {
        return 4 * side;
    }

    public double getArea()
    {
        return side * side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
