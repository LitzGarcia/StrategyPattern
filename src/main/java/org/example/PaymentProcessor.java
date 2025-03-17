package org.example;

import org.example.strategys.BoletoPayment;
import org.example.strategys.CreditCardPayment;
import org.example.strategys.PixPayment;

import java.util.Map;

public class PaymentProcessor {
    //esta classe irá processar o pagamento executando o metodo(processPayment) da strategia pedida
    private final double valor;
    private String paymentStrategy;

    //Aqui temos uma estrutura Map que contém a chave (Metodo de pagamento) e valor, instancia de cada estratégia
    Map<String, PaymentStrategy>  mapStrategy = Map.of(
            "Boleto" , new BoletoPayment(),
            "Pix", new PixPayment(),
            "Cartão de Crédito" , new CreditCardPayment()
    );

    public PaymentProcessor(String paymentStrategy, double valor) {
        this.paymentStrategy = paymentStrategy;
        this.valor = valor;
    }


    public void execute() {
        //Aqui chamamos o a estrutura map com o get e ela nos retorna uma instância da estrategia que queremos
        //A partir disso já chamamos o metodo processPayment que possui o mesmo nome independente do metodo de pagamento
        //pois todas as estratégias implemetam a interface com esse metodo
        mapStrategy.get(paymentStrategy).processPayment(valor);
        System.out.println("Pagamento Processado");
    }

}
