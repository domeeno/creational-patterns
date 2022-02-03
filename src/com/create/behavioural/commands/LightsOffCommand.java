package com.create.behavioural.commands;

public class LightsOffCommand implements Command{
    Light light;

    public LightsOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
