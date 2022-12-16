package com.sankan.springframeworkstartproject;

import com.sankan.springframeworkstartproject.game.*;
public class AppGamingBasicJava {

    public static void main(String[] args) {

        var marioGame = new MarioGame();
        var contra = new Contra();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();

        
    }

}
