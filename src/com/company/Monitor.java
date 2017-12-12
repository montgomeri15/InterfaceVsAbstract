package com.company;

public class Monitor extends Parameters {

    private double height;
    private double width;

    public Monitor(double height, double width) {
        super(height, width);  //в класс-наследник передаются данные из родительского
        this.height = height;
        this.width = width;
    }

    @Override
    public double result() {
        return Math.sqrt( (Math.pow(height, 2)) + (Math.pow(width, 2)));
    }
}
