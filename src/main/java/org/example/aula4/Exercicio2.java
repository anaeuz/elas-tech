package org.example.aula4;

public class Exercicio2 {
    static void main() {
        //Crie variáveis para o saldo da conta (R$ 500.00) e o valor de uma compra (R$ 320.00). Se o saldo for suficiente,
        // mostre "Compra aprovada!" e o saldo restante. Se não for, mostre "Saldo insuficiente" e quanto está faltando.

        double saldo = 1;
        double compra = 320.00;

        if(saldo >= compra){
            System.out.println("Compra aprovada, o saldo restante:" +(saldo-compra));
       }
        else if(compra > saldo){
            System.out.println("Saldo insuficiente, falta " + (compra-saldo));
        }

        }
    }
