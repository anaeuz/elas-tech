package org.example.aula3;

public class Operadores {
        static void main() {
            {
                String nome = "Ana";
                String cidade = "Florianópolis";
                int idade = 26;

                System.out.println("Meu nome é " + nome + ", moro em " + cidade + " e tenho " + idade + " anos.");
            }
            {

                String produto = "Caneca";
                double preco = 12.50;
                int quantidade = 4;

                System.out.println("Comprei " + quantidade + " unidades de " + produto + " por R$" + preco + " cada. Total:R$" + preco * quantidade);
            }
            {
                int num1 = 15;
                int num2 = 4;

                System.out.println("A soma de " + num1 + " e " + num2 + " é igual a " + (num1 + num2));
            }
            {
                System.out.println("2 + 2 = " + 2 + 2);
                System.out.println("2 + 2 = " + (2 + 2));
                //Quando a operação não está entre parenteses, os números são concatenados e não somados
            }
            {
                int a = 10;
                int b = 3;

                System.out.println((a + b));
                System.out.println((a - b));
                System.out.println((a * b));
                System.out.println((a / b));
                System.out.println((a % b));
            }
            {
                double a = 10;
                double b = 3;

                System.out.println((a + b));
                System.out.println((a - b));
                System.out.println((a * b));
                System.out.println((a / b));
                System.out.println((a % b));
            }
            {
                int nota1 = 6;
                int nota2 = 8;
                int nota3 = 10;

                System.out.println("A soma é " + (nota1 + nota2 + nota3) + " e a média é " + ((nota1 + nota2 + nota3) / 3));
            }
            {
                int a = 3;
                int b = 4;
                int c = 5;

                System.out.println((a+b*c));
            }
            {
                int a = 3;
                int b = 4;
                int c = 5;

                System.out.println(((a+b)*c));
            }
            {
                int segundos= 3875;
                int minutos = segundos / 60;
                int segundosRestantes = segundos % 60;

                System.out.println("Total de segundos: " + segundos);
                System.out.println("Isso dá " + minutos + " minutos inteiros.");
                System.out.println("E sobram " + segundosRestantes + " segundos.");
            }
        }

    }

