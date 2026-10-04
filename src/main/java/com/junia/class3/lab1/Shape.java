package com.junia.class3.lab1;

public abstract class Shape {

    public abstract double area();

    public void display() {
        System.out.println("Area = " + area());
    }
}
