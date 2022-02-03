package com.create.structural.adapter;

import com.create.structural.adapter.interfaces.Duck;
import com.create.structural.adapter.interfaces.Turkey;

public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.jumping();
    }
}
