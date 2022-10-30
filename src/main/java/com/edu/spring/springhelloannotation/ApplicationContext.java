package com.edu.spring.springhelloannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationContext {
    @Bean
    public PersonBean person() {
        return new PersonBean("Dmitrii", 33);
    }
}
