package com.edu.spring.strongdependency;

public class House {
    private final Window window;

    public House(Window window) {
        this.window = window;
    }

    public void view() {
        window.isOpen();
    }

    public static void main(String[] args) {
        Window window = new WoodWindow();
        House house = new House(window);
        house.view();
    }
}
