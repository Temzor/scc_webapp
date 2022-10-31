package com.edu.spring.springdixml;

public class WoodWindow implements Window {
    @Override
    public void isOpen() {
        System.out.println(WoodWindow.class.getName() + " is open");
    }
}
