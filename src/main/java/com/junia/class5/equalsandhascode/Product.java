package com.junia.class5.equalsandhascode;

import java.util.Objects;

public class Product {
    public String name;
    public int id;
    public Double price;


    public Product(String name, int id, Double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof Product otherProd)) return false;

        return this.id == otherProd.id && this.name == otherProd.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
