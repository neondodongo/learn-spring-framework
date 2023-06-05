package com.neondodongo.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
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
