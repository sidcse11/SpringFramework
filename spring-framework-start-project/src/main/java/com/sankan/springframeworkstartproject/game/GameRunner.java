package com.sankan.springframeworkstartproject.game;


public class GameRunner {

    MarioGame marioGame;
    //Tightly coupled -> Need to whole code to support contra

    public GameRunner(MarioGame marioGame){
        this.marioGame = marioGame;
    }

    public void run() {
        System.out.println("Running game : "+ marioGame);
        marioGame.up();
        marioGame.down();
        marioGame.right();
        marioGame.left();

    }

}