import java.util.Scanner;

/**
 * @author Samuel Marques
 *
 * */

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/


public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] vetorConsoante = new String[6];
        int qtdConsoante = 0, count = 0;

        do {
            System.out.println("Digite o Caractere: ");
            String letra = scanner.next();

            if (!(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u")))
            {
                vetorConsoante[count] = letra;
                qtdConsoante++;
            }

            count++;

        }while (count < vetorConsoante.length);

        System.out.print("Consoante: ");
        for (String consoante: vetorConsoante) {  // Laço ForEach
            if (consoante != null) System.out.print(consoante + " ");
        }

        System.out.println("\nQuantidade de Consoantes: " + qtdConsoante);

    }
}
