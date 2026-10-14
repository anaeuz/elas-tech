package org.example.aula16;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private String numeroConta = "001-X";

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
    public String getNumeroConta() {
        return numeroConta;
    }


    public void setTitular(String titular) {
        if (titular == null || titular.isEmpty()) {
            System.out.println("Titular inválido! Mantido " + this.titular);
            return;
        }

        this.titular = titular;
    }
}