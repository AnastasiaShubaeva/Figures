package com.company.special;
import com.company.Parallelogram;
import com.company.Point;

public class Square extends Parallelogram{
	public  Square(Point a, Point b, Point c, Point d) {
		super(a,b,c,d);
	}
	
	@Override
	public double getArea() {
		return Math.pow(this.lengthOfRibs(a,b), 2);
	}
	@Override
	public double getPerimeter() {		
		return this.lengthOfRibs(b, a)*4;
	}
	@Override
	public String toString() {
		return "Square-" + super.toString();
	}
	
}
