package com.junia.class5.streams;

import com.junia.class5.equalsandhascode.Product;

import java.util.List;

public class ProductService {
    public static List<String> getProductsNamesForProductsThatCostMoreThan100EurosSorted(List<Product> products) {
        return products.stream()
                .filter(product -> product.getPrice() >= 100)
                .map(Product::getName)
                .sorted()
                .toList();
    }

    public static Double getCartTotalPrice(List<Product> products) {
        return products.stream()
                .map(Product::getPrice)
                .reduce(Double.valueOf(0), Double::sum);
    }
}
