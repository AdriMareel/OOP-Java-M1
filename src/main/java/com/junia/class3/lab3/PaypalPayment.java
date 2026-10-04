package com.junia.class3.lab3;

public class PaypalPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paypal payment of " + amount + " made");
    }
}
