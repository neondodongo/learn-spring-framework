package com.neondodongo.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
// Primary indicates a bean should be given preference when multiple candidates are qualified to autowire a single-valued dependency
@Primary
public class MarioGame implements GamingConsole {

    public void up() {
        System.out.println("up pressed");
    }

    public void down() {
        System.out.println("down pressed");
    }

    public void left() {
        System.out.println("left pressed");
    }

    public void right() {
        System.out.println("right pressed");
    }
}
