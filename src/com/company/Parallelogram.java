package com.company;

public class Parallelogram extends Polygon{
	public Parallelogram (Point a, Point b, Point c, Point d) {
		super(a, b, c, d);
	}
	@Override
	public double getPerimeter() {
		return (this.lengthOfRibs(a, b)+this.lengthOfRibs(b, c))*2;
	}
	
	@Override 
	public double getArea() {
			return this.lengthOfRibs(b, c)*this.lengthOfRibs(b, a)*this.sinAngle(a,b,b,c);
	}
	@Override
	public double getHeight() {
		return this.getArea()/this.lengthOfRibs(a, b);
	}
	@Override
	public String toString() {
		return "Parallelogram: " + super.toString() + " and " + this.lengthOfRibs(a,d);
	}
}
