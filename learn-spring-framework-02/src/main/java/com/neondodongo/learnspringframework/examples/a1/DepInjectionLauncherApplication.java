package com.neondodongo.learnspringframework.examples.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class YourBusinessClass {

//    @Autowired
    // Field injection - no setter or constructor; uses reflection
    Dependency1 dependency1;

//    @Autowired
    Dependency2 dependency2;

//    @Autowired
    // Constructor-based injection - Dependencies are set by creating the Bean using its Constructor
    // The annotation is not explicitly required
    // Recommended by the Spring team!
    // All the initialization happens in 1 method.
    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        System.out.println("Constructor Injection - YourBusinessClass");
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

//    @Autowired
    // Setter-based injection - Dependencies are set by calling setter methods on your beans
//    public void setDependency1(Dependency1 dependency1) {
//        System.out.println("Setter Injection - setDependency1");
//        this.dependency1 = dependency1;
//    }
//
//    @Autowired
//    public void setDependency2(Dependency2 dependency2) {
//        System.out.println("Setter Injection - setDependency2");
//        this.dependency2 = dependency2;
//    }

    public String toString() {
        return "Using " + dependency1 + " and " + dependency2;
    }

}

@Component
class Dependency1 {

}

@Component
class Dependency2 {

}

// Instead of a separate Configuration class, we can give the main class the annotation
@Configuration
// We have to tell Spring where to find the beans via the package name
// Can omit giving a specific package if the package to scan is the current package
@ComponentScan
public class DepInjectionLauncherApplication {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        System.out.println(context.getBean(YourBusinessClass.class));
    }
}
