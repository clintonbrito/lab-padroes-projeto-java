package com.clintonbrito.strategy;

public class RegularBehavior implements Behavior {
    @Override
    public void move() {
        System.out.println("Moving regularly...");
    }
}
