package com.edu.spring.labwork1.figure;

import com.edu.spring.labwork1.Figure;
import com.edu.spring.labwork1.XY;

public class Point extends Figure {
    public Point(String color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Draw circle");
    }

    XY xy = new XY(2, 2);
}
