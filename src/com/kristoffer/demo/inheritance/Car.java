package com.kristoffer.demo.inheritance;

public class Car extends AVehicle implements Vehicle  {

    @Override
    public void start() {
        System.out.println("VROM VROM");
    }

    @Override
    public void crash() {
        System.out.println("OH NOooo-");
    }

    @Override
    public void expandFuel() {
        System.out.println("-1 fuel");
    }

    @Override
    public void horn() {
        System.out.println("HONK HONK");
    }

    @Override
    public void durability() {
        durability = 100;
        System.out.println("Durability is: " + durability);
    }
}
