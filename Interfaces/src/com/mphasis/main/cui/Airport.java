package com.mphasis.main.cui;

import com.mphasis.contracts.Flyers;
import com.mphasis.entities.Helicopter;
import com.mphasis.entities.Seaplane;

public class Airport {

    private void givePermissionToLand(Flyers f){
        f.land();
    };

    public static void main(String[] args) {
        Airport metropolisAirport = new Airport();
        Helicopter copter = new Helicopter();
        Seaplane sPlane = new Seaplane();
        metropolisAirport.givePermissionToLand(copter);
        metropolisAirport.givePermissionToLand(sPlane);
        }
}
