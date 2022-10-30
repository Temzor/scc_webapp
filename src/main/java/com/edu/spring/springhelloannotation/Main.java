package com.edu.spring.springhelloannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationContext.class);
        PersonBean person = context.getBean(PersonBean.class);

        System.out.println(person.getName() + " -  " + person.getAge());

        context.close();
    }
}
