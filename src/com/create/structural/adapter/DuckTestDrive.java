package com.create.structural.adapter;

import com.create.structural.adapter.birds.MallardDuck;
import com.create.structural.adapter.birds.WildTurkey;
import com.create.structural.adapter.interfaces.Duck;

public class DuckTestDrive {

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();

        Duck adaptedTurkey = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says");
        turkey.gobble();
        turkey.jumping();

        System.out.println("The mallard duck says");
        testDuck(duck);

        System.out.println("The pseudo-duck says");
        testDuck(adaptedTurkey);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
