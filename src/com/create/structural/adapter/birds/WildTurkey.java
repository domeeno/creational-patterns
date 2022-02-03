package com.create.structural.adapter.birds;

import com.create.structural.adapter.interfaces.Turkey;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble Gobble");
    }

    @Override
    public void jumping() {
        System.out.println("Flying but shorter, almost like jumping");
    }
}
