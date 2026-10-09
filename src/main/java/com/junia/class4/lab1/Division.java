package com.junia.class4.lab1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        try {

            int result = a / b;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (InputMismatchException e) {
            System.out.println("Error : Input is not of type integer");
        }

        scanner.close();
    }
}
