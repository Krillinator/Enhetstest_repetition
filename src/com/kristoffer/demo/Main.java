package com.kristoffer.demo;

import com.kristoffer.demo.inheritance.Airplane;
import com.kristoffer.demo.inheritance.Car;

public class Main {

    public static void main(String[] args) {

        Airplane airplane = new Airplane();
        Car car = new Car();

        airplane.start();
        car.start();
        car.durability();

    }

}
