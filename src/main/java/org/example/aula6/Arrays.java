package org.example.aula6;

public class Arrays {
    static void exercicio1() {
      String[] nome = {"ana", "paula", "carol", "paulo", "pedro"};
      System.out.println(nome[0]);
      System.out.println(nome[2]);
      System.out.println(nome[4]);
    }

    static void exercicio2() {
        int[] notas = {8, 6, 10, 7, 9};

        for(int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": "+ notas[i]);
        }
    }

    public static void main(String[] args) {
    exercicio2();
}
}
