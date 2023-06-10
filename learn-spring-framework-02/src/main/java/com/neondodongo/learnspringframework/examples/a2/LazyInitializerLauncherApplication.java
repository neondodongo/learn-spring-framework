package com.neondodongo.learnspringframework.examples.a2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ClassA {

}

@Component
// default initialization of Spring beans is "Eager"
// this is always recommended as errors will be discovered on application start up
// @Lazy is not recommended and not frequently used
@Lazy
class ClassB {
    ClassA classA;

    public ClassB(ClassA classA) {
        System.out.println("some initialization logic for ClassB...");
        this.classA = classA;
    }

    public void doSomething() {
        System.out.println("doing something!");
    }
}

@ComponentScan
public class LazyInitializerLauncherApplication {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(LazyInitializerLauncherApplication.class);
//        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("Initialization of context is completed");
        context.getBean(ClassB.class).doSomething();

    }
}
