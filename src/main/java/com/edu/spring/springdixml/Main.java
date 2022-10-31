package com.edu.spring.springdixml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContextSpringDI.xml");

        House house = context.getBean("houseBean", House.class);

        house.buildWall();
        house.view();

        System.out.println("House height: " + house.getHeight());

        MainWindow mainWindow = context.getBean(MainWindow.class);

        mainWindow.show();

        context.close();
    }
}
