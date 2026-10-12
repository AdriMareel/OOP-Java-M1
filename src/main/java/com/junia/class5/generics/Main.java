package com.junia.class5.generics;

import com.junia.class5.equalsandhascode.Product;

public class Main {
    Box<String> stringBox = new Box<>("Alice");
    Box<Integer> integerBox = new Box<>(28);
    Box<Product> productBox = new Box<>(new Product("a", 1, 1.00));
}
