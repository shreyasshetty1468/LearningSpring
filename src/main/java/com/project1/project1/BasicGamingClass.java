package com.project1.project1;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.project1.project1.game.GameRunner;
import com.project1.project1.game.MarioGame;
public class BasicGamingClass {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(BasicGamingClass.class, args);
        GameRunner gameRunner = context.getBean(GameRunner.class);
        gameRunner.run();
    }
}
