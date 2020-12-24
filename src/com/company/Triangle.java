package com.company;

public class Triangle extends Polygon{
	public Triangle (Point a, Point b, Point c) {
		super(a, b, c);
	}
	@Override
	public double getPerimeter() {
		return lengthOfRibs(a, b) + lengthOfRibs(b, c) + lengthOfRibs(a, c);
	}
	@Override 
	public double getArea() {
		return lengthOfRibs(a, b) * lengthOfRibs(b, c) * this.sinAngle(a, b, b, c)/2;
	}
	@Override
	public double getHeight() {
		return this.getArea()*2/this.lengthOfRibs(a, b);
	}
		
	public double diameterOfInscribedCircle() {
		return this.getArea()*2/this.getPerimeter();
	}
	public double diameterOfCircumscribedCircle() {
		return lengthOfRibs(a, b) * lengthOfRibs(b, c) * lengthOfRibs(a, c)/(4*this.getArea());
	}
	@Override
	public String toString() {
		return "Triangle: " + super.toString()+ ", " + this.lengthOfRibs(b, c)+ ", " + this.lengthOfRibs(a, c) + 
				", diameter of the inscribed circle=" + this.diameterOfInscribedCircle() + ",\n   diameter of the circumscribed circle=" 
				+ this.diameterOfCircumscribedCircle();
	}
}
