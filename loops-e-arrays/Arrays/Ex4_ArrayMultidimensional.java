import java.util.Random;

/**
 * @author Samuel Marques
 *
 * */

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
*/

public class Ex4_ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int [][] matriz = new int[4][4];

        // Popular a Matriz
        for (int i = 0; i < matriz.length;i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = random.nextInt(9);
            }
        }

        // Imprimir a Matriz

        System.out.println("Matriz: ");
        for (int[] linha: matriz) {
            for (int coluna: linha) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }


    }
}
