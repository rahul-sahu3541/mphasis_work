package com.mphasis.entities;

import com.mphasis.contracts.Sailer;

public class Seaplane extends Airplane implements Sailer {
    public void land(){
        System.out.println("Seaplane lands");
    }

    @Override
    public void dock() {
        System.out.println("Seaplane is docking");
    }

    @Override
    public void cruise() {
        System.out.println("Seaplane is cruising");
    }
}
