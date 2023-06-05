package com.neondodongo.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// Component indicates to Spring that this class should be managed
@Component
public class PacmanGame implements GamingConsole{
    public void up() {
        System.out.println("waka up");
    }

    public void down() {
        System.out.println("waka down");
    }

    public void left() {
        System.out.println("waka left");
    }

    public void right() {
        System.out.println("waka right");
    }
}
