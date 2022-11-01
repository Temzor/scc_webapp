package com.edu.spring.springdixml.doors;

public class MetalDoor implements Door {
    @Override
    public void install() {
        System.out.println("Install metal door");
    }
}
