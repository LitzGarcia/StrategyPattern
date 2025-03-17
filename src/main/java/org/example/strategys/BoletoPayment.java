package org.example.strategys;

import org.example.PaymentStrategy;

import java.util.Random;

public class BoletoPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        Random random = new Random();
        String boletoCode = "2379" + (100000 + random.nextInt(900000));
        System.out.println("CÓDIGO DO BOLETO: " + boletoCode);
    }
}
