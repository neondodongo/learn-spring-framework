package com.neondodongo.learnspringframework.examples.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

// Instead of a separate Configuration class, we can give the main class the annotation
@Configuration
// We have to tell Spring where to find the beans via the package name
// Can omit giving a specific package if the package to scan is the current package
@ComponentScan
public class SimpleSpringContextLauncherApplication {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(SimpleSpringContextLauncherApplication.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
