package com.edu.spring.labwork1.figure;

import com.edu.spring.labwork1.Figure;

import java.util.Map;

public class ObjectFigure {
    private Circle circle;
    private Point point;

    private Map<String, Figure> figureMap;

    public ObjectFigure(Circle circle, Point point, Map<String, Figure> figureMap) {
        this.circle = circle;
        this.point = point;
        this.figureMap = figureMap;
    }

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public Map<String, Figure> getFigureMap() {
        return figureMap;
    }

    public void setFigureMap(Map<String, Figure> figureMap) {
        this.figureMap = figureMap;
    }

    public static void main(String[] args) {

    }
}
