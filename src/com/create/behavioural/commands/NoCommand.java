package com.create.behavioural.commands;

public class NoCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Nothing");
    }
}
