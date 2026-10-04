package com.junia.class3.lab1;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        List<Shape> shapes = List.of(circle, rectangle);

        for (Shape shape : shapes) {
            shape.display();
        }
    }
}
