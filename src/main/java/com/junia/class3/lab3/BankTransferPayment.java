package com.junia.class3.lab3;

public class BankTransferPayment
        implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println(
                "Processing bank transfer..."
        );

        System.out.println(
                "Paid " + amount + "€ by bank transfer"
        );
    }
}
