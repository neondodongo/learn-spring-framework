package com.neondodongo.learnspringframework;

import com.neondodongo.learnspringframework.game.GameRunner;
import com.neondodongo.learnspringframework.game.MarioGame;
import com.neondodongo.learnspringframework.game.PacmanGame;
import com.neondodongo.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {
    public static void main(String[] args) {
        // 1: Object creation - the game(s)
        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var pacmanGame = new PacmanGame();

        // 2: Object creation + Wiring of Dependencies
        // The game is a dependency of GameRunner
        var marioGameRunner = new GameRunner(marioGame);
        var superContraGameRunner = new GameRunner(superContraGame);
        var pacmanGameRunner = new GameRunner(pacmanGame);

        marioGameRunner.run();
        superContraGameRunner.run();
        pacmanGameRunner.run();
    }
}
