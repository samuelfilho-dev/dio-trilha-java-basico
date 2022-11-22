import jdk.jshell.Snippet;

import java.util.Scanner;

/**
 * @author: Samuel Marques
 * */

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qtdNumeros = 0,contador = 0, numero = 0;
        int qtdPares = 0, qtdImpares = 0;

        System.out.println("Quantos Números para inserir: ");
        qtdNumeros = scanner.nextInt();

        do {
            System.out.println("Qual Número: ");
            numero = scanner.nextInt();
            contador++;

            if (numero % 2 == 0){
                qtdPares++;
            }else{
                qtdImpares++;
            }


        }while (contador < qtdNumeros);

        System.out.println("");
        System.out.println("===========================================");
        System.out.println("Quantidade De Pares: " + qtdPares);
        System.out.println("Quantidade De Impares: " + qtdImpares);
        System.out.println("===========================================");
    }
}
