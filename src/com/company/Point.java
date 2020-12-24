package com.company;

public class Point {
	private double x, y;
	Point(double x, double y){
		this.x=x;
		this.y=y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double length (Point a) {
		return Math.sqrt(Math.pow(x-a.x, 2)+Math.pow(y-a.y, 2));
	}
	@Override
	public String toString() {
		return "[x=" + x + ", y=" + y + "]";
	}
}
