package com.company;


import java.util.Comparator;

public class ComparisonOfFigures implements Comparator<Figure> {
	ComparisonOfFigures(){}
	@Override
    public int compare(Figure f1, Figure f2){
		if (f1.getArea() > f2.getArea())
			 return 1;
			 else if (f1.getArea() < f2.getArea())
			 return -1;
			 else
			 return 0;
    }

}
