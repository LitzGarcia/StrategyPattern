package org.example;

import org.example.strategys.PixPayment;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String paymentMethod = "";

        System.out.println("SELECIONE A ESTRATÉGIA DE PAGAMENTO:\n" +
                "1: Pix \n" +
                "2: Cartão de Crédito \n" +
                "3: Boleto ");

        System.out.println("Digite aqui: ");
        int opc = sc.nextInt();

        System.out.println("Digite o valor da trasação");
        double valor = sc.nextDouble();


        switch (opc){
            case 1 -> paymentMethod = "Pix";
            case 2 -> paymentMethod = "Cartão de Crédito";
            case 3 -> paymentMethod = "Boleto";
        }

        //É instanciado uma classe Payment Processor e é chamado seu metodo de pagamento
        //É passado como paramentro o tipo de pagamento selecionado no switch case e o valor a ser mandado
        new PaymentProcessor(paymentMethod,valor).execute();
    }
}