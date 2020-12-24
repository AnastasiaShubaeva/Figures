package com.company.special;
import com.company.Triangle;
import com.company.Point;

public class EquilateralTriangle extends Triangle{
	public EquilateralTriangle(Point a, Point b, Point c) {
		super(a,b,c);
	}

	@Override
	public double getArea() {
		return Math.pow(lengthOfRibs(a, b), 2)*Math.sqrt(3)/4;
	}

	@Override
	public String toString() {
		return "Equilateral " + super.toString();
	}

	@Override
	public double getPerimeter() {
		return lengthOfRibs(a, b)*3;
	}

	@Override
	public double diameterOfInscribedCircle() {
		// TODO Auto-generated method stub
		return lengthOfRibs(a, b)/(Math.sqrt(3)*2);
	}
	
	
}
