package org.example.aula5;

import java.util.Scanner;

public class ListaRevisao1 {
    static void exercicio1() {
        System.out.println("ExercÍcio 1");
        // Crie um programa que peça ao usuário para digitar o nome de um lanche e o valor dele.
        // Em seguida, verifique: se o valor for maior que R$ 30.00, aplique um desconto de R$ 5.00.
        // No final, exiba uma mensagem usando concatenação e printf para formatar o preço com duas casas decimais.
        //Exemplo de saída: "O lanche Xis-Bacon custa R$ 28.50 \n

        String nomeLanche;
        double valor;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do lanche:");
        nomeLanche = sc.nextLine();

        System.out.println("Digite o valor");
        valor = sc.nextDouble();

        if (valor > 30) {
            valor = valor - 5;
        }

        System.out.printf("O lanche " + nomeLanche + "custa R$ %.2f%n", valor);
    }

    static void exercicio2() {
        //Faça um programa que use um laço for para contar de 1 até 15.
        // Dentro do for, coloque um if para verificar se o número atual é par ou ímpar (dica: use o operador de
        //resto da divisão % 2 == 0).
        //Imprima na tela o número e a palavra correspondente.
        //Exemplo de saída:
        //"1 é Ímpar"
        //"2 é Par"


    }


    static void exercicio3() {
        //Faça um programa que use um laço for para contar de 1 até 15.
        // Dentro do for, coloque um if para verificar se o número atual é par ou ímpar (dica: use o operador de
        //resto da divisão % 2 == 0).
        //Imprima na tela o número e a palavra correspondente.
        //Exemplo de saída:
        //"1 é Ímpar"
        //"2 é Par"


    }

    static void exercicio4() {
        //Faça um programa que use um laço for para contar de 1 até 15.
        // Dentro do for, coloque um if para verificar se o número atual é par ou ímpar (dica: use o operador de
        //resto da divisão % 2 == 0).
        //Imprima na tela o número e a palavra correspondente.
        //Exemplo de saída:
        //"1 é Ímpar"
        //"2 é Par"

    }

    static void exercicio5() {
        //Crie uma classe chamada Produto com os atributos nome (String) e preco (double).
        //
        //Na classe principal, faça um laço for que repita 3 vezes.
        //
        //A cada repetição, o programa deve usar o Scanner para perguntar o nome e o preço de um produto.
        //
        //Instancie um novo Produto e guarde nele os valores digitados.
        //
        //Logo em seguida, faça um if: se o preço do produto for maior que 100, imprima "Produto caro!".
        // Se for menor ou igual, imprima "Produto com preço acessível!". Use printf para mostrar o valor.

        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
            Scanner sc = new Scanner(System.in);
            Produto novoProduto = new Produto();
            System.out.println("Qual o nome do produto?");
            novoProduto.nome = sc.nextLine();
            System.out.println("Qual o valor do produto?");
            novoProduto.preco = sc.nextDouble();

            if (novoProduto.preco > 100) {
                System.out.printf("O valor É %.2f. Produto caro!\n", novoProduto.nome, novoProduto.preco);
            } else {
                System.out.printf("O valor É %.2f. Produto com preço acessivel\n", novoProduto.nome, novoProduto.preco);

            }
        }

    }
}