package com.sankan.springframeworkstartproject.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration{

    @Bean
    public String name(){
        return "Diego Garcia";
    }
}