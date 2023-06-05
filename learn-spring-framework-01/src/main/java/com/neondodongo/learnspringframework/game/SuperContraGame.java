package com.neondodongo.learnspringframework.game;

public class SuperContraGame implements GamingConsole {
    public void up() {
        System.out.println("aim up");
    }

    public void down() {
        System.out.println("aim down");
    }

    public void left() {
        System.out.println("move left");
    }

    public void right() {
        System.out.println("move right");
    }
}
