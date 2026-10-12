package com.junia.class5.equalsandhascode;

public class Main {
    static void main() {
        Product product1 = new Product("product1", 1, 12.00);
        Product product2 = new Product("product1", 1, 12.00);

        System.out.println(product1 == product2);
        System.out.println(product1.equals(product2));
    }
}
