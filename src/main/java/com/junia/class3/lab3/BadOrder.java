package com.junia.class3.lab3;

public class BadOrder {

    private CreditCardPayment creditCard;
    private PaypalPayment paypal;
    private BankTransferPayment bankTransfer;

    public void pay(String type, long amount) {

        if (type.equals("CARD")) {
            creditCard.pay(amount);

        } else if (type.equals("PAYPAL")) {
            paypal.pay(amount);

        } else if (type.equals("BANK")) {
            bankTransfer.pay(amount);
        }
    }
}
