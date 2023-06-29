package com.project1.project1;

import com.project1.project1.game.GameRunner;
import com.project1.project1.game.MarioGame;

public class BasicGamingClass {
    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}
