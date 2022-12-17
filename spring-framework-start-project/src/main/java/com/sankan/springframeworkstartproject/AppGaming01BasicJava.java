package com.sankan.springframeworkstartproject;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sankan.springframeworkstartproject.game.GameConsole;
import com.sankan.springframeworkstartproject.game.GameRunner;

public class AppGaming01BasicJava {

    public static void main(String[] args) {

    try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
    context.getBean(GameConsole.class).up();
    context.getBean(GameRunner.class).run();
    } catch (BeansException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    
        
}
}
