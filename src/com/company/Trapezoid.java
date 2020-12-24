package com.company;

public class Trapezoid extends Polygon{
	public Trapezoid(Point a, Point b, Point c, Point d) {
		super(a, b, c, d);
	}
	@Override
	public double getPerimeter() {
		return this.lengthOfRibs(a, b)+this.lengthOfRibs(c, b)+this.lengthOfRibs(c, d)+this.lengthOfRibs(a, d);
	}
	
	@Override 
	public double getArea() {
			return this.lengthOfRibs(a, c)*this.lengthOfRibs(d, b)*this.sinAngle(a,c,b,d)/2;
	}
	@Override
	public double getHeight() {
		return this.getArea()*2/(this.lengthOfRibs(a, b)+this.lengthOfRibs(c, d));
	}
	@Override
	public String toString() {
		return "Trapezoid: " + super.toString() + ", " + this.lengthOfRibs(b, c)+ ", " + this.lengthOfRibs(d, c)+ ", " + this.lengthOfRibs(a, d);
	}

}
