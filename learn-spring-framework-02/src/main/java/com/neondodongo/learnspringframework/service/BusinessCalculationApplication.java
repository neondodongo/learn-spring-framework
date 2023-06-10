package com.neondodongo.learnspringframework.service;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class BusinessCalculationApplication {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(BusinessCalculationApplication.class);

        System.out.println(context.getBean(BusinessCalculationService.class).findMax());
    }
}
