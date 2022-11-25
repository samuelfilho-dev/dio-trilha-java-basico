import java.util.Scanner;

/**
 * @author: Samuel Marques
 * */

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fatorial, multiplicacao = 1;

        System.out.println("Fatorial de Qual Número: ");
        fatorial = scanner.nextInt();

        for (int i = fatorial; i >= 1; i--){
            multiplicacao *= i;
        }

        System.out.println(fatorial + "! = " + multiplicacao);

    }
}
