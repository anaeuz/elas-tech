package org.example.aula4;

public class Exercicio3 {
    static void main() {
        //Crie uma variável opcao com um número de 1 a 4 e, usando switch, mostre o pedido escolhido no cardápio:
        // 1 é Café, 2 é Cappuccino, 3 é Chocolate quente e 4 é Chá. Qualquer outro número mostra "Opção inválida".

        int pedido =4;

        switch (pedido) {
            case 1:
                System.out.println("Café");
                break;

            case 2:
                System.out.println("Cappuccino");
                break;

            case 3:
                System.out.println("Chocolate quente");
                break;

            case 4:
                System.out.println("Chá");
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
