package com.neondodongo.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// Eliminate verbosity in creating Java Beans
// Public accessor methods, constructor, equals, hashcode and toString are automatically created.
// Released in JDK 16
record Person(String name, int age, Address address){}
// Address - firstLine, city
record Address(String firstLine, String city){}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Will";
    }

    @Bean
    public int age() {
        return 1000;
    }

    @Bean
    public Person person(){
        return new Person("Brittany", 500, new Address("456 Apple St", "Boston"));
    }

    @Bean
    public Person person2MethodCall(){
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address3){
        // the parameters being used correlate to existing beans that are being managed by Spring.
        return new Person(name, age, address3);
    }

    @Bean
    @Primary
    public Person person4Parameters(String name, int age, Address address){
        // the parameters being used correlate to existing beans that are being managed by Spring.
        return new Person(name, age, address);
    }

    @Bean
    public Person person5Qualifier(String name, int age, @Qualifier("address3qualifier") Address address){
        return new Person(name, age, address);
    }

    @Bean(name = "addressBean")
    @Primary
    public Address address(){
        return new Address("123 Sesame St", "New York City");
    }

    @Bean
    @Qualifier("address3qualifier")
    public Address address3(){
        return new Address("789 Peach Drive", "Chicago");
    }

}
