package com.mphasis.entities;

import com.mphasis.contracts.Flyers;

public class Airplane extends Vehicle implements Flyers {
    @Override
    public void takeoff() {
        System.out.println("Airplane takes off");
    }

    @Override
    public void land() {
        System.out.println("Airplane lands");
    }

    @Override
    public void flies() {
        System.out.println("Airplane flies");
    }
}
