package org.example.DesignPatterns.Problem4.betterCode;

public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;
    public PaymentProcessor(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void process(double amount) {
        paymentStrategy.processPayment(amount);
    }
//    Dynamically change the payment  strategy at runtime
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}
