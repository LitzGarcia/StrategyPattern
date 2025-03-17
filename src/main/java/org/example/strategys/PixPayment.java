package org.example.strategys;

import org.example.PaymentStrategy;

import java.util.UUID;

public class PixPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        String pixCode = UUID.randomUUID().toString();
        System.out.println("CÓDIGO DO PIX:\n" + pixCode);
    }
}
