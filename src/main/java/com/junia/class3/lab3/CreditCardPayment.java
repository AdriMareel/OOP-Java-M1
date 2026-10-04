package com.junia.class3.lab3;

public class CreditCardPayment
        implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println(
                "Processing credit card payment..."
        );

        System.out.println(
                "Paid " + amount + "€ by credit card"
        );
    }
}
