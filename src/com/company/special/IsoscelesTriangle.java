package com.company.special;

import com.company.Point;
import com.company.Triangle;

public class IsoscelesTriangle extends Triangle{
	public IsoscelesTriangle(Point a, Point b, Point c) {
		super(a,b,c);
	}

	@Override
	public String toString() {
		return "Isosceles " + super.toString();
	}

	
}
