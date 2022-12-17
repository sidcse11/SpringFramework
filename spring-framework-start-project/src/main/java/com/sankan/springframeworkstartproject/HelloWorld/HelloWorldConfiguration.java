package com.sankan.springframeworkstartproject.HelloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Records are immutable data classes that require only the type and name of fields
//We also receive public getters methods, whose names match the name of our field, for free.
//Using records, a public constructor, with an argument for each field, is generated for us.

record Person(String name,int age,Address address){};
record Address(String firstLine,String city){};

@Configuration
public class HelloWorldConfiguration{

    @Bean
    public String name(){
        return "Diego Garcia";
    }

    @Bean
    public int age(){
        return 15;
    }

    @Bean(name="address2")
    public Address address(){
        Address address = new Address("Hiroshima","Japan");
        return address;
    }
    
    //Configure your own custom name
    @Bean(name="address3")
    public Address address_new(){
        Address address = new Address("Delhi","India");
        return address;
    } 
    

    @Bean
    public Person person(){
        Person person = new Person("Rohit",24,new Address("Baker Street","London"));
        return person;
    } 
    
    //Using existing bean to create new bean
    @Bean
    public Person personMethodCall(){
        return new Person(name(), age(), address());
    } 

    @Bean
    public Person personParameter(String name,int age,Address address3){
        return new Person(name,age,address3);
    }


}