package com.company.special;

import com.company.Point;
import com.company.Triangle;

public class RightTriangle extends Triangle{
	public RightTriangle(Point a, Point b, Point c) {
		super(a,b,c);
	}

	@Override
	public double getArea() {
		if (this.cosAngle(a, b, b, c)==0) {
		return lengthOfRibs(a, b) * lengthOfRibs(b, c)/2;
		}
		else if  (this.cosAngle(b, c, c, a)==0) {
			return lengthOfRibs(c, b) * lengthOfRibs(a, c)/2;
		}
		else return lengthOfRibs(c, a) * lengthOfRibs(a, b)/2;
	}

	@Override
	public String toString() {
		return "Right " + super.toString();
	}
}
