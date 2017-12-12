package com.company;

public class Computer implements Status {

    private String name;

    public Computer(String name) {
        this.name = name;
    }

    @Override
    public void turnOn() {
        System.out.println("Компьютер " + name + " On.");
    }

    @Override
    public void turnOff() {
        System.out.println("Компьютер " + name + " Off.");
    }
}
