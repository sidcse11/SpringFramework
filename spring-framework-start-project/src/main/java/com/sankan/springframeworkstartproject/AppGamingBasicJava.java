package com.sankan.springframeworkstartproject;

import com.sankan.springframeworkstartproject.game.*;
public class AppGamingBasicJava {

    public static void main(String[] args) {

        //var game = new MarioGame();
        var gane = new Contra();
        var gameRunner = new GameRunner(contra);
        gameRunner.run();

        
    }

}
