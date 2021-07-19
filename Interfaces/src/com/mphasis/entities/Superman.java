package com.mphasis.entities;

import com.mphasis.contracts.Flyers;

public class Superman extends Kryptonian implements Flyers {
    @Override
    public void takeoff() {
        System.out.println("Superman takesoff");
    }

    @Override
    public void land() {
        System.out.println("Superman lands");
    }

    @Override
    public void flies() {
        System.out.println("Superman flies");
    }
    public void leapBuilding(){
        System.out.println("Superman leaps building");
    }
    public void stopBullets(){
        System.out.println("Superman stops the bullets");
    }
}
