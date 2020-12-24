package com.company;

public abstract class Figure {
	protected Point a;
	public Figure() {};
	public Figure(Point a) {
		this.a = a;
	};
	public abstract double getPerimeter();
	public abstract double getArea();
	public Point getA() {
		return a;
	}
	public void setA(Point a) {
		this.a = a;
	}
	@Override
	public String toString() {
		return " a=" + a;
	}
}
