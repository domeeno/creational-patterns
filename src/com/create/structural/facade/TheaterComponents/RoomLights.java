package com.create.structural.facade.TheaterComponents;

public class RoomLights {
    public void adjust(int dimming) {
        if(dimming < 10) {
            System.out.println("room is dim now");
        } else {
            System.out.println("room is bright now");
        }
    }
}
