/**
 * @author Samuel Marques
 *
 * */

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class Ex1_OrdemInversa {
    public static void main(String[] args) {


        // Declaração Do Vetor
        int[] vetor = {1,2,3,4,5,6};
        int count = 0;


        // Impressão do Vetor no Laço While

        System.out.print("Vetor: ");
        while (count < (vetor.length)){
            System.out.print(vetor[count] + " ");
            count++;
        }

        // Impressão do Vetor no Laço For

        System.out.print("\nVetor Inverso: " );
        for (int i = (vetor.length - 1); i >= 0; i--){
            System.out.print(vetor[i] + " ");
        };

    }
}
