package com.neondodongo.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    GamingConsole gamingConsole;

    // To specify which game to run, we can use the Qualifier annotation to select the desired GamingConsole
    // Since the SuperContraGame is annotated with the same qualifier, it will run instead of the Primary
    public GameRunner(@Qualifier("SuperContraGameQualifier") GamingConsole gamingConsole) {
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
