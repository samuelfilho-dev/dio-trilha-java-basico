import java.util.Scanner;

/**
 * @author: Samuel Marques
 * */

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero, contador = 0;
        int maior = 0, soma = 0;


        do {
            // Entrada dos Números
            System.out.println("Qual é o Número: ");
            numero = scanner.nextInt();

            //Calculo da Soma do números
            soma += numero;

            // Verificação do Maior Número
            if(numero > maior){
                maior = numero;
            }

            // Contagem do loop
            contador++;
        }while (contador < 5);

        System.out.println("Maior Número: " + maior);
        System.out.println("Médias Dos Números: " + (soma/5));

    }

}
