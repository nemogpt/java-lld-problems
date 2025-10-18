package org.example.DesignPatterns.Problem4.betterCode;

public class DebitCardPayment implements PaymentStrategy{
    private String cardNumber;
    private String cardHolderName;
    private String expirationDate;
    private String cvv;

    public DebitCardPayment(String cardNumber, String cardHolderName, String expirationDate, String cvv) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }
    @Override
    public void processPayment(double amount) {
        // Logic to process debit card payment
        System.out.println("Processing debit card payment of $" + amount);
    }
}
