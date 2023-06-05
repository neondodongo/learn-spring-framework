package com.neondodongo.learnspringframework.game;

public class GameRunner {
    GamingConsole gamingConsole;
    public GameRunner(GamingConsole gamingConsole) {
        this.gamingConsole = gamingConsole;
    }

    public void run() {
        System.out.println("Running game: " + gamingConsole);
        gamingConsole.up();
        gamingConsole.down();
        gamingConsole.left();
        gamingConsole.right();
    }
}
