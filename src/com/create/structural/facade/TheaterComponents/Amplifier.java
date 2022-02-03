package com.create.structural.facade.TheaterComponents;

public class Amplifier {
    public void setMovie(Movie movie) {
        System.out.println("Movie " + movie.getName() + " " + movie.getYear() + " started" );
    }

    public void setVolume(int volume) {
        if(volume >= 5 && volume <= 10) {
            System.out.println("Playing comfortable movie sound");
        } else if (volume < 5) {
            System.out.println("Playing silently movie sound");
        } else {
            System.out.println("Playing loudly movie sound");
        }
    }

    public void eject(Movie movie) {
        System.out.println(movie.getName() + " ejected");
    }
}
