package com.sankan.springframeworkstartproject;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sankan.springframeworkstartproject.game.GameConsole;
import com.sankan.springframeworkstartproject.game.GameRunner;

@Configuration
@ComponentScan("com.sankan.springframeworkstartproject.game")
public class GamingAppLauncherApplication {

    public static void main(String[] args) {

    try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {
    context.getBean(GameConsole.class).up();
    context.getBean(GameRunner.class).run();
    } catch (BeansException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    
        
}
}
