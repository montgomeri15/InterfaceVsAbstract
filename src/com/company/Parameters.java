package com.company;

public abstract class Parameters {

    private double height;
    private double width;

    public Parameters(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public void getParameters(){
        System.out.println("Высота: " + height + ". Ширина: " + width + ".");
    }

    public abstract double result();
}
