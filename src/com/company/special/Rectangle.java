package com.company.special;
import com.company.Parallelogram;
import com.company.Point;

public class Rectangle extends Parallelogram{
	public Rectangle(Point a, Point b, Point c, Point d) {
		super(a,b,c,d);
	}
		@Override
	public double getArea() {
		return this.lengthOfRibs(b, c)*this.lengthOfRibs(b, a);
	}
	@Override
	public String toString() {
		return "Rectangle-" + super.toString();
	}
}
