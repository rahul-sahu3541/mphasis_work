package com.mphasis.entities;

import com.mphasis.contracts.Flyers;

public class Bird extends Animal implements Flyers{
    @Override
    public void takeoff() {
        System.out.println("Bird is taking of");
    }

    @Override
    public void land() {
        System.out.println("Bird is landing");
    }

    @Override
    public void flies() {
        System.out.println("Bird is flying");
    }
    public void buildNest(){
        System.out.println("Bird is building nest");
    }
    public void layEggs(){
        System.out.println("Bird is laying eggs");
    }

}
