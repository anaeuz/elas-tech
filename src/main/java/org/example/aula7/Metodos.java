package org.example.aula7;

import java.util.Scanner;

public class Metodos {
    /* public static void mostrarBoasVindas() {
             System.out.println("Bem-vinda ao curso de Java!");
     }
     public static void main(String[] args){
         mostrarBoasVindas();
     }

     public static void main(String[] args){
         Utilidades.saudar("Ana");
         Utilidades.saudar("Maria");
         Utilidades.saudar("João");
     }

     public static void main(String[] args){
         System.out.println(Utilidades.dobro(6));
     }


     public static void main(String[] args){
         double nota1;
         double nota2;
         Scanner sc = new Scanner(System.in);

         System.out.println("Digite sua primeira nota");
         nota1 = sc.nextDouble();

         System.out.println("Digite sua segunda nota");
         nota2 = sc.nextDouble();

         System.out.printf("A média é: %.2f", Utilidades.calcularMedia(nota1, nota2));

     }


    public static void main(String[] args) {
        int idade;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade");
        idade = sc.nextInt();

        if (Utilidades.ehMaiorDeIdade(idade)) {
            System.out.println("É maior de idade");
        } else {
            System.out.println("É menor de idade");
        }
    }


    public static void main(String[] args) {

        System.out.println(Utilidades.somar(2, 3));

        System.out.println(Utilidades.somar(2, 3, 4));

        System.out.println(Utilidades.somar(2.5, 3.5));
    }
    */

    public static void main(String[] args) {
        Utilidades.saudacao();

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();

        Utilidades.saudacao(nome);
    }
}


