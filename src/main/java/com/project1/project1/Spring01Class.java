package com.project1.project1;
import com.project1.project1.game.CricketGame;
import com.project1.project1.game.GameRunner;
import com.project1.project1.game.GamingInterface;
import org.springframework.context.annotation.*;
@Configuration
@ComponentScan("com.project1.project1.game")
public class Spring01Class {
    @Bean
    public GameRunner gameRunner(GamingInterface game) {
        return new GameRunner(game);
    }
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Spring01Class.class);
        context.getBean("gameRunner", GameRunner.class).run();
    }
}
