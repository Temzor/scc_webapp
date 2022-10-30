package com.edu.spring.springhelloxml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonBean person = context.getBean("personBean", PersonBean.class);

        System.out.println(person.getName() + " -  " + person.getAge());
        System.out.println(person);
        System.out.println(context.getBean("personBean"));

        context.close();
    }
}
