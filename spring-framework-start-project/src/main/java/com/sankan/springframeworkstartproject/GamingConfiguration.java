package com.sankan.springframeworkstartproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sankan.springframeworkstartproject.game.Contra;
import com.sankan.springframeworkstartproject.game.GameConsole;
import com.sankan.springframeworkstartproject.game.GameRunner;

@Configuration
public class GamingConfiguration {

    @Bean
    public GameConsole gameConsole(){
        var game = new Contra();
        return game;
    }

    @Bean 
    public GameRunner gameRunner(GameConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }
    
}
