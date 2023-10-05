package com.kristoffer.demo.inheritance;

public class Airplane implements Vehicle {

    @Override
    public void start() {
        System.out.println("Prepare for liftoff");
    }

    @Override
    public void crash() {
        System.out.println("Kaboom");
    }

    @Override
    public void expandFuel() {
        System.out.println("Expanding NormalFuel x 10");
    }

    @Override
    public void horn() {
        System.out.println("Airplanes do have horns, we don't know the sound though");
    }
}
