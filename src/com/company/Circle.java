package com.company;

public class Circle extends Figure{
    private double radius;
    public Circle(Point center, double radius) {
        super(center);
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getDiametr() {
        return radius*2;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public String toString() {
        return "Circle: radius=" + radius +","+ super.toString() + ", area="+this.getArea() + ", perimetr=" + this.getPerimeter();
    }
}
