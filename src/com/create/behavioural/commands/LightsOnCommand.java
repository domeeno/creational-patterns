package com.create.behavioural.commands;

public class LightsOnCommand implements Command {
    Light light;

    public LightsOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
