package com.edu.spring.strongdependency;

public class PlasticWindow implements Window {
    @Override
    public void isOpen() {
        System.out.println(PlasticWindow.class.getName() + " is open");
    }
 }
