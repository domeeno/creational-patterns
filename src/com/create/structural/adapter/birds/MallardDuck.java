package com.create.structural.adapter.birds;

import com.create.structural.adapter.interfaces.Duck;

public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("QUACK!");
    }

    @Override
    public void fly() {
        System.out.println("Flying!");
    }
}
