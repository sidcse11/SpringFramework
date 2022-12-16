package com.sankan.springframeworkstartproject.game;

public class MarioGame implements GameConsole {

    public void up(){
        System.out.println("Jump");
    }

    public void down(){
        System.out.println("Go inside tunnel");
    }

    public void left(){
        System.out.println("Go back");
    }

    public void right(){
        System.out.println("Accelerate");
    }

}