package com.junia.class5.generics;

public class ArrayPrinter {

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charles"};
        Integer[] numbers = {10, 20, 30};

        printArray(names);

        System.out.println("---");

        printArray(numbers);
    }
}

