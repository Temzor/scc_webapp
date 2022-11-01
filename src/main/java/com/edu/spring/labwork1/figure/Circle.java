package com.edu.spring.labwork1.figure;

import com.edu.spring.labwork1.Figure;
import com.edu.spring.labwork1.XY;

public class Circle extends Figure {
    public Circle(String color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Draw point");
    }

    XY xy = new XY(1, 6);
}
