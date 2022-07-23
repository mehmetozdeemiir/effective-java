package com.example.Item23JavaClassHierarchy;

public class Retangle extends FigureTrue{

    final double lenght;
    final double width;

    public Retangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    @Override
    double area() {
        return lenght*width;
    }
}
