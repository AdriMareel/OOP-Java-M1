package com.junia.class5.streams;

import com.junia.class5.equalsandhascode.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {

        //Part 1
        List<Integer> numbers =
                List.of(3, 1, 5, 6, 2, 4);

        List<Integer> result = numbers.stream()
                .filter(number -> number % 2 == 0)
                .sorted()
                .map(number -> number * 2)
                .toList();


        System.out.println(result);


        //Part 2
        List<Product> products = new ArrayList<>(List.of(
                new Product("Laptop", 1, 1299.99),
                new Product("Smartphone", 2, 899.00),
                new Product("Headphones", 3, 149.50),
                new Product("Keyboard", 4, 79.99),
                new Product("Mouse", 5, 29.90),
                new Product("Monitor", 6, 249.00),
                new Product("USB Cable", 7, 9.99),
                new Product("Webcam", 8, 89.00),
                new Product("Desk Lamp", 9, 35.00),
                new Product("Office Chair", 10, 199.99)
        ));

        List<String> names = ProductService.getProductsNamesForProductsThatCostMoreThan100EurosSorted(products);
        Double cartAmount = ProductService.getCartTotalPrice(products);

        System.out.println(names);
        System.out.println(cartAmount);
    }
}
