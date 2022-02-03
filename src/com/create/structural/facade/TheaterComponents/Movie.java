package com.create.structural.facade.TheaterComponents;

public class Movie {
    String name;
    String year;

    public Movie(String name, String year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public void on() {
        System.out.println(name + " is starting");
    }

    public void play() {
        System.out.println(name + " is playing");
    }

    public void end() {
        System.out.println(name + " ended");
    }
}
