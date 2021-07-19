package com.mphasis.main.cui;

import com.mphasis.contracts.Sailer;
import com.mphasis.entities.RiverBarge;
import com.mphasis.entities.Seaplane;

public class Harbor {
    public static void main(String[] args) {
        Harbor bostonHarbor= new Harbor();
        RiverBarge barge = new RiverBarge();
        Seaplane sPlane = new Seaplane();
        bostonHarbor.givePermissionToDock(barge);
        bostonHarbor.givePermissionToDock(sPlane);
    }

    private void givePermissionToDock(Sailer s) {
        s.dock();
    }
}
