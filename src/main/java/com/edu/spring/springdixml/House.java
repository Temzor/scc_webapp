package com.edu.spring.springdixml;

public class House {
    private Window window;
    private Material wall;
    private int height;

    public House(Window window, int height) {
        this.window = window;
        this.height = height;
    }

    public House(Window window) {
        this.window = window;
    }

    public void view() {
        window.isOpen();
    }

    public void buildWall() {
        for (int i = 1; i <= getHeight(); i++) {
            System.out.print("Этаж №" + i);
            getWall().cover();
        }
    }

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Material getWall() {
        return wall;
    }

    public void setWall(Material wall) {
        this.wall = wall;
    }
}
