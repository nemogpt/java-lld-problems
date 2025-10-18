package org.example.DesignPatterns.Problem4.problematicCode;

public class PaymentProcessor {
    public void processPayment(String paymentType, double amount) {
        if (paymentType.equals("CreditCard")) {
            // Process credit card payment
            System.out.println("Processing credit card payment of $" + amount);
        } else if (paymentType.equals("PayPal")) {
            // Process PayPal payment
            System.out.println("Processing PayPal payment of $" + amount);
        } else if (paymentType.equals("Bitcoin")) {
            // Process Bitcoin payment
            System.out.println("Processing Bitcoin payment of $" + amount);
        } else {
            System.out.println("Unsupported payment type: " + paymentType);
        }
    }
}
