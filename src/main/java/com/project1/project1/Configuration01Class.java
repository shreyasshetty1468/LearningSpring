package com.project1.project1;

import com.project1.project1.game.GameRunner;
import com.project1.project1.game.GamingInterface;
import com.project1.project1.game.MarioGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuration01Class {

    @Bean
    public GamingInterface game() {
        return new MarioGame();
    }

    @Bean
    public GameRunner gameRunner(GamingInterface game) {
        return new GameRunner(game);
    }
}
