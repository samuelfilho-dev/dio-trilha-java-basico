import java.util.Scanner;

/**
 * @author: Samuel Marques
 * */

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo até que o usuário informe um valor válido.
*/

public class Ex2_Nota {


    public static void main(String[] args) {

        int nota;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota: ");
        nota = sc.nextInt();

        while (nota < 0 || nota > 10){

            System.out.println("Nota Invalida! Digite nova Nota: ");
            nota = sc.nextInt();

        }

        System.out.println("FIM");
    }
    }

