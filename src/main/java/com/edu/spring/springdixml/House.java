package com.edu.spring.springdixml;

import com.edu.spring.springdixml.doors.Door;
import com.edu.spring.springdixml.material.Material;
import com.edu.spring.springdixml.windows.Window;


import java.util.Map;

public class House {
    private Window window;
    private Material wall;
    private int height;

    /*private Collection<Door> doors;
     */
    private Map<String, Door> doors;

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

    public void installDoors() {
        for (Map.Entry<String, Door> e :doors.entrySet()) {
            System.out.printf("Key %s ", e.getKey());
            e.getValue().install();
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

    public Map<String, Door> getDoors() {
        return doors;
    }

    public void setDoors(Map<String, Door> doors) {
        this.doors = doors;
    }
}
