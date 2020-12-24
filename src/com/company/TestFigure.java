package com.company;
import com.company.special.*;
import java.io.*;

public class TestFigure {

	public static void main(String[] args) {
		Point s = new Point(0,0);
		Circle ocr = new Circle(s, 2);
		System.out.println(ocr);
		Point s1 = new Point(2, 3);
		Point s2 = new Point(4,0);
		Point s3 = new Point(2,-3);
		Rhombus romb = new Rhombus(s, s1, s2, s3);
		System.out.println(romb);
		Point p1 = new Point(-4, 2);
		Point p2 = new Point(1.5, 2);
		Point p3 = new Point(-1, -1);
		Point p4 = new Point(-6.5, -1);
		Parallelogram prlg = new Parallelogram(p1,p2,p3,p4);
		System.out.println(prlg);
		Point t1 = new Point(1, 2);
		Point t2 = new Point(7, 2);
		Point t3 = new Point(4, 5);
		Point t4 = new Point(2, 5);
		Trapezoid trap = new Trapezoid(t1,t2,t3,t4);
		System.out.println(trap);
		Point t5 = new Point(1, -4);
		Point t6 = new Point(1, -1);
		Point t7 = new Point(-2, -3);
		Triangle trng = new Triangle(t5,t6,t7);
		System.out.println(trng);
		Point r1 = new Point(1, 2);
		Point r2 = new Point(1,5);
		Point r3 = new Point(-4, 5);
		Point r4 = new Point(-4, 2);
		Rectangle rect = new Rectangle(r1,r2,r3,r4);
		System.out.println(rect);
		Point r6 = new Point(-2,2);
		Point r5 = new Point(-2,5);
		Square sq = new Square(r1,r2,r5,r6);
		System.out.println(sq);
		RightTriangle rtr = new RightTriangle(r1,r2,r4);
		System.out.println(rtr);
		Point eqt1 = new Point(10.196,0);
		Point eqt2 = new Point(5,9);
		Point eqt3 = new Point(-0.196,0);
		EquilateralTriangle eqt = new EquilateralTriangle(eqt1,eqt2,eqt3);
		System.out.println(eqt);
		Point ist1 = new Point(7,-3);
		Point ist2 = new Point(5,0);
		Point ist3 = new Point(3,-3);
		IsoscelesTriangle ist = new IsoscelesTriangle(ist3,ist1,ist2);
		System.out.println(ist);
		Comparison<Figure> cmp = new Comparison<Figure>();
		System.out.println("Triangle compare Isosceles Triangle = " + cmp.compare(trng, ist));
		System.out.println("Circle compare Trapezoid = " + cmp.compare(ocr, trap));
		System.out.println("Parallelogram compare Equilateral Triangle = " + cmp.compare(prlg, eqt));
		File file = new File("C:\\JavaProjects\\Figures", "Figures.txt");
		try(FileWriter writer = new FileWriter(file))
				{           
					 String text = ocr.toString() + "\n" + romb.toString()  + "\n" + prlg.toString()  + "\n" + trap.toString() + "\n"
								+ trng.toString()  + "\n" + rect.toString()  + "\n" + sq.toString() + "\n" + rtr.toString() + "\n"
								+ eqt.toString() + "\n" + ist.toString();
				            writer.write(text);            
				            writer.append('\n');                        
				            writer.flush();
				        }
				        catch(IOException ex){
							ex.printStackTrace();
						}

	}

}
