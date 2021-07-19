package com.mphasis.entities;

import com.mphasis.contracts.Sailer;

public class RiverBarge implements Sailer {
    @Override
    public void dock() {
        System.out.println("Riverbarge dock");
    }
    @Override
    public void cruise() {
        System.out.println("Riverbarge cruise");
    }
}
