package com.edu.spring.springdixml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        double d = Math.pow(10, 100) - Math.pow(10, -100);

        System.out.println(d);
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContextSpringDI.xml");

        House house = context.getBean("houseBean", House.class);

        house.buildWall();
        house.installDoors();
        house.view();

        System.out.println("House height: " + house.getHeight());

        MainWindow mainWindow = context.getBean(MainWindow.class);

        mainWindow.show();

        System.out.println(context.getBean("houseBean", House.class));
        System.out.println(context.getBean("houseBean", House.class));

        context.close();
    }
}
