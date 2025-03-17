package org.example.strategys;

import org.example.PaymentStrategy;

import java.util.Scanner;

public class CreditCardPayment implements PaymentStrategy {
    private int numeroCartao;
    Scanner sc = new Scanner(System.in);
    @Override
    public void processPayment(double amount) {
        System.out.println("Digite aqui o número do seu cartão de crédito:");
        sc.nextLine();
        System.out.println("Pagamento efetuado!");
    }
}
