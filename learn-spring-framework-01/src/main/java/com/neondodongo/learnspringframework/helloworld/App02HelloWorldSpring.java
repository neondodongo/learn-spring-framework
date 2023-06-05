package com.neondodongo.learnspringframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        // 1. Launch a Spring Context (application)
        try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
            // 2. Configure the things that we want Spring to manage - @Configuration (class)
            // name - @Bean

            // 3. Retrieving Beans managed by Spring
            // the "name" refers to the configuration function names
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("addressBean"));
            // Can use either the name or type of the bean to retrieve the bean
            System.out.println(context.getBean(Person.class));
            System.out.println(context.getBean(Address.class));
            System.out.println(context.getBean("person2MethodCall"));
            System.out.println(context.getBean("person3Parameters"));
            System.out.println(context.getBean("person5Qualifier"));

            String[] definitions = context.getBeanDefinitionNames();
            Arrays.stream(definitions).forEach(System.out::println);
        }
    }
}
