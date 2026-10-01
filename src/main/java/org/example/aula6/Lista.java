package org.example.aula6;

import java.util.Scanner;

public class Lista {

    static void contador() {
        System.out.println("Exercício 1");

        String nomeCompleto;
        int nome;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome nome completo");
        nomeCompleto = sc.nextLine();
        nome = nomeCompleto.length();

        System.out.printf("O seu nome tem " + nome + " letras");
    }

    static void exercicio2 () {
        System.out.println("Exercício 2");

        String nomeCompleto;
        String nomeMaiusculo;
        String nomeMinusculo;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome nome completo");
        nomeCompleto = sc.nextLine();
        nomeMaiusculo = nomeCompleto.toUpperCase();
        nomeMinusculo = nomeCompleto.toLowerCase();

        System.out.println(nomeMinusculo);
        System.out.println(nomeMaiusculo);
    }

    static void exercicio3 () {
        System.out.println("Exercício 3");

        String nomeCompleto;
        char primeiraLetra;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome nome completo");
        nomeCompleto = sc.nextLine();
        primeiraLetra = nomeCompleto.charAt(0);


        System.out.println(primeiraLetra);

    }

    static void exercicio4 () {
        System.out.println("Exercício 4");

        String frase;
        String palavra;
        boolean compare;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase");
        frase = sc.nextLine();
        System.out.println("Digite uma palavra");
        palavra = sc.nextLine();

        compare = frase.contains(palavra);

        System.out.println(compare);

    }

    static void exercicio5 () {
        System.out.println("Exercício 5");

        String nome1;
        String nome2;
        boolean compare;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome");
        nome1 = sc.nextLine();
        System.out.println("Digite seu nome novamente");
        nome2 = sc.nextLine();

        compare = nome2.equalsIgnoreCase(nome1);

        System.out.println(compare);
    }
    public static void main(String[] args) {
        exercicio4();
    }
}