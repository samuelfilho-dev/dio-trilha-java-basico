/**
 * @author Samuel Marques
 * */

// Classe Que Calcula a area de um quadrilatero

public class Quadrilatero {

    public static void area(double lado){
        System.out.println("Area do Quadrado: " + (lado * lado));
    }
    public static void area(double lado1, double lado2){
        System.out.println("Area do Retângulo: " + (lado1 * lado2));
    }
    public static void area(double baseMaior, double baseMenor, double altura){
        System.out.println("Area do Quadrado: " + (((baseMaior + baseMenor)*altura) / 2));
    }

    public static void area(float diagonalMenor, float diagonalMaior){
        System.out.println("Area do Losango: " + ((diagonalMaior * diagonalMenor) / 2));
    }

}
