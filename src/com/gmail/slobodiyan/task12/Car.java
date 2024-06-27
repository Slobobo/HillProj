package com.gmail.slobodiyan.task12;

public class Car {

    private void startElectricity() {
        System.out.println("Electricity started");
    }

    private void startCommand() {
        System.out.println("Commend started");
    }

    private void startFuelSystem() {
        System.out.println("Fuel system started");
    }

    private void stopEverything() {
        System.out.println("Stop");
    }

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("Car started");
        stopEverything();

    }

    public static void main(String[] args) {
        Car porshe = new Car();
        porshe.start();
    }
}
