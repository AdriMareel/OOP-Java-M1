package com.junia.class3.lab3;

public class Order {

    private String id;
    private double amount;
    private PaymentMethod paymentMethod;

    public Order(
            String id,
            double amount,
            PaymentMethod paymentMethod) {

        this.id = id;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public void pay() {
        paymentMethod.pay(amount);
    }
}
