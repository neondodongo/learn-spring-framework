package com.neondodongo.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// Instead of a separate Configuration class, we can give the main class the annotation
@Configuration
// We have to tell Spring where to find the beans via the package name
@ComponentScan("com.neondodongo.learnspringframework.game")
public class GamingAppLauncherApplication {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class);

        context.getBean(GamingConsole.class).up();
        context.getBean(GameRunner.class).run();
    }
}
