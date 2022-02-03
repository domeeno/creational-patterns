package com.create.structural.facade;

import com.create.structural.facade.TheaterComponents.*;

public class HomeTheaterFacade {
    Amplifier amplifier;
    Tuner tuner;
    Projector projector;
    RoomLights roomLights;
    Popcorn popcorn;

    public HomeTheaterFacade(Amplifier amplifier, Tuner tuner, Projector projector, RoomLights roomLights, Popcorn popcorn) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.projector = projector;
        this.roomLights = roomLights;
        this.popcorn = popcorn;
    }

    public void watchMovie(Movie movie) {
        System.out.println("Getting ready to watch " + movie);
        popcorn.startPreparation();
        popcorn.serve();
        roomLights.adjust(5);
        amplifier.setMovie(movie);
        amplifier.setVolume(10);
        movie.on();
        movie.play();
        popcorn.diminishing();
    }

    public void endMovie(Movie movie) {
        System.out.println("Movie " + " ending :(");
        movie.end();
        roomLights.adjust(15);
        amplifier.eject(movie);
        popcorn.clean();
    }
}
