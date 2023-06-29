package com.project1.project1.game;
import org.springframework.stereotype.Component;
@Component
public class MarioGame implements GamingInterface{
    public void up() {
        System.out.println("up");
    }
    public void down() {
        System.out.println("down");
    }
    public void left() {
        System.out.println("left");
    }
    public void right() {
        System.out.println("right");
    }
}
