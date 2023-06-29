package com.project1.project1.game;

public class GameRunner {
    GamingInterface game;
    public GameRunner(GamingInterface game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running game: " + this.game);
        this.game.up();
        this.game.down();
        this.game.left();
        this.game.right();
    }
}
