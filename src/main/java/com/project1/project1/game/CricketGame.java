import org.springframework.stereotype.Component;
package com.project1.project1.game;
@Component
public class CricketGame implements  GamingInterface{
    public void up() {
        System.out.println("fjkfjkfj up");
    }
    @Override
    public void down() {
        System.out.println("fjkfjkfj down");
    }
    @Override
    public void left() {
        System.out.println("fjkfjkfj left");
    }
    @Override
    public void right() {
        System.out.println("fjkfjkfj right");
    }
}
