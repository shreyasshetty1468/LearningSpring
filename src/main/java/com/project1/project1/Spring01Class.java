package com.project1.project1;
import com.project1.project1.game.CricketGame;
import com.project1.project1.game.GameRunner;
import com.project1.project1.game.GamingInterface;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("com.project1.project1.game")
public class Spring01Class {
    @Bean
    public GamingInterface game() {
        return new CricketGame();
    }
    @Bean
    public GameRunner gameRunner(GamingInterface game) {
        return new GameRunner(game);
    }
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Spring01Class.class);
        context.getBean("game", GamingInterface.class).up();
        context.getBean("gameRunner", GameRunner.class).run();
    }
}
