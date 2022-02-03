package com.create.structural.facade.TheaterComponents;

public class Popcorn {
    public void startPreparation() {
        System.out.println("popcorn getting ready");
    }

    public void serve() {
        System.out.println("popcorn served");
    }

    public void diminishing() {
        System.out.println("popcorn is slowly disappearing");
    }

    public void clean() {
        System.out.println("cleaning the mess made");
    }
}
