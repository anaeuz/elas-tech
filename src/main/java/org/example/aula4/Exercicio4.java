package org.example.aula4;

public class Exercicio4 {
    static void main() {
        // Crie variáveis idade (17) e temAutorizacao (true).
        // Mostre se a pessoa pode entrar na festa: precisa ter 18 anos ou ter autorização. Faça o mesmo para
        // precisa ter 18 anos e ter autorização.

        int idade = 17;
        boolean temAutorizacao = false;

        if(idade >=18 || temAutorizacao == true)
        {
            System.out.println("Tem 18 anos ou mais ou tem a autorizaçÃo");
        }
        else if(idade >=18 && temAutorizacao == true)
        {
            System.out.println("Tem 18 anos ou mais e tem a autorizaçÃo");
        }
    }
}
