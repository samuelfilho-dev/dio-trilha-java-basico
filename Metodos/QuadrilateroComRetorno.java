/**
 * @author Samuel Marques
 * */

// Classe Que Calcula a area de um quadrilatero

public class QuadrilateroComRetorno {

    public static double area(double lado){
         return lado * lado;
    }
    public static double area(double lado1, double lado2){
       return (lado1 * lado2);
    }
    public static double area(double baseMaior, double baseMenor, double altura){
        return (((baseMaior + baseMenor)*altura) / 2);
    }

    public static float area(float diagonalMenor, float diagonalMaior){
       return ((diagonalMaior * diagonalMenor) / 2);
    }
}
