package com.company;

public abstract class Polygon extends Figure{
	protected Point b, c, d;
	public Polygon (Point a, Point b, Point c, Point d) {
		super(a);
		this.b = b;
		this.c = c;
		this.d = d;
	}
	public Polygon (Point a, Point b, Point c) {
		super(a);
		this.b = b;
		this.c = c;
		this.d = null;
	}
	public double lengthOfRibs(Point j, Point k) {
		return j.length(k);
	}
	public abstract double getHeight();
	@Override
	public String toString() {
		return super.toString() + ", b=" + b + ", c=" + c + ", d=" + d + ", perimeter=" + getPerimeter() + ", area="
				+ getArea() + ",\n   height=" + getHeight() + ", length of ribs=" + lengthOfRibs(a, b);
	}
	public double cosAngle (Point p1, Point p2, Point p3, Point p4) {
		Point a1 = new Point(p1.getX()-p2.getX(), p1.getY()-p2.getY());
		Point a2 = new Point(p3.getX()-p4.getX(), p3.getY()-p4.getY());
		return (a1.getX()*a2.getX()+a1.getY()*a2.getY())/(Math.sqrt(Math.pow(a1.getX(), 2)+Math.pow(a1.getY(), 2))*Math.sqrt(Math.pow(a2.getX(), 2)+Math.pow(a2.getY(), 2)));
	}
	public double sinAngle (Point p1, Point p2, Point p3, Point p4) {
		return Math.sqrt(1-Math.pow(this.cosAngle(p1,p2,p3,p4), 2));
	}
}
