package com.sankan.springframeworkstartproject.HelloWorld;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldSpring {

    public static void main(String[] args) {
        try (//1. Launch a Spring Context
var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
    //3. Retrieving bean managed by spring
       System.out.println(context.getBean("name"));
       System.out.println(context.getBean("person"));
       System.out.println(context.getBean("address2"));
       System.out.println(context.getBean("personMethodCall"));
       System.out.println(context.getBean("personParameter"));
    
       //List all beans managed by spring framework
       Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
} catch (BeansException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}

   //2. Configure the things that we want spring to manage 
   // HelloWorldConfiguration - @Configuration
   // name - @Bean



}
}
