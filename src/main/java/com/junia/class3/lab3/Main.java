package com.junia.class3.lab3;

public class Main {
    public static void main(String[] args) {
        Order order1 =
                new Order(
                        "ORD-001",
                        100,
                        new CreditCardPayment()
                );


        Order order3 =
                new Order(
                        "ORD-003",
                        300,
                        new BankTransferPayment()
                );

        order1.pay();
        order3.pay();
    }
}
