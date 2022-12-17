package com.sankan.springframeworkstartproject.game;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    //GameRunner class is loosely coupled. It does not matter what game you are running. 
    //You dont need to change the game runner to change the game
    GameConsole game;

    public GameRunner(GameConsole game){
        this.game = game;
    }

    public void run() {
        System.out.println("Running game : "+ game);
        game.up();
        game.down();
        game.right();
        game.left();

    }

}