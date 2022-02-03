package com.create.structural.facade;

import com.create.structural.facade.TheaterComponents.*;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Movie movie = new Movie("Dune", "2021");
        Amplifier amplifier = new Amplifier();
        Popcorn popcorn = new Popcorn();
        Tuner tuner = new Tuner();
        RoomLights roomLights = new RoomLights();
        Projector projector = new Projector();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplifier, tuner, projector, roomLights, popcorn);

        homeTheater.watchMovie(movie);
        homeTheater.endMovie(movie);
    }
}
