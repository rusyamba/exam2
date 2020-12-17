package com.company;

import java.sql.SQLOutput;

public class Circle {
    int radius;

    public void Circle(){
        System.out.println("Circle: ");
        int[] array = new int[10];
        for(int i = 0; i < array.length; i++){
            array[i] = i++;
        }
    }
    int Pi = (int) 3.14;

    public void square(){
        int square = radius * radius * Pi;
        System.out.println("Square of circle: " + square);
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
