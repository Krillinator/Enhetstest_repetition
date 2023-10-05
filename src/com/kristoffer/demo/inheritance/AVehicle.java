package com.kristoffer.demo.inheritance;

public abstract class AVehicle {

    int durability;
    protected int dur;

    public abstract void durability();

    public void steer() {
        System.out.println("Steers the vehicle");
    }

}
