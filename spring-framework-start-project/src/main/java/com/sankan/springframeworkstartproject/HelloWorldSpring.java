package com.sankan.springframeworkstartproject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sankan.springframeworkstartproject.game.HelloWorldConfiguration;

public class HelloWorldSpring {

    public static void main(String[] args) {
        //1. Launch a Spring Context
   var context =  new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

   //2. Configure the things that we want spring to manage 
   // HelloWorldConfiguration - @Configuration
   // name - @Bean

   //3. Retrieving bean managed by spring
   System.out.println(context.getBean("name"));
    }

}
