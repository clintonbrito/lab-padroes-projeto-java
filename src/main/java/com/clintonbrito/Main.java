package com.clintonbrito;

import com.clintonbrito.facade.Facade;
import com.clintonbrito.singleton.SingletonEager;
import com.clintonbrito.singleton.SingletonLazy;
import com.clintonbrito.singleton.SingletonLazyHolder;
import com.clintonbrito.strategy.*;

public class Main {
    public static void main(String[] args) {
        // Singleton

        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        // Facade

        Facade facade = new Facade();
        facade.migrateCustomer("Bill", "08061040");

        // Strategy

        Behavior defensive = new DefensiveBehavior();
        Behavior regular = new RegularBehavior();
        Behavior aggressive = new AggressiveBehavior();

        Robot robot = new Robot();
        robot.setBehavior(regular);
        robot.move();
        robot.move();
        robot.setBehavior(defensive);
        robot.move();
        robot.setBehavior(aggressive);
        robot.move();
        robot.move();
        robot.move();

    }
}