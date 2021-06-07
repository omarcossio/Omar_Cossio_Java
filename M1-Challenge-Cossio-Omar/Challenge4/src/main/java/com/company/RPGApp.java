package com.company;

import javax.print.attribute.standard.JobImpressions;
import java.awt.*;

public class RPGApp {
    public static void main(String[] args) {
        Role manny = new Farmer("Manny");
        makeRun(manny);
        healFarmer((Farmer) manny);

        Role tom = new Constable("Tom");
        makeArrest((Constable) tom);

        Role omar = new Warrior("Omar");
        makeAttack(omar);
        makeShieldStrengthGoDown((Warrior) omar);
    }

    public static void makeRun(Role role) {role.run(); }

    public static void makeArrest(Constable constable) {constable.arrest();}

    public static void makeAttack(Role role) {
        role.attack();
    }

    public static void makeShieldStrengthGoDown(Warrior warrior) {
        warrior.decreaseShieldStrength();
    }

    public static void healFarmer(Farmer f){ f.heal();}



}
