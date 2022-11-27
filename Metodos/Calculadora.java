/**
 * @author Samuel Marques
 * */

// Classe da Calculadora

public class Calculadora {

    public static void soma(int numero1, int numero2 ){
        int resultado = numero1 + numero2;
        System.out.println("A Soma Dos Números: " + resultado);
    }

    public static void subtracao(int numero1, int numero2 ){
        int resultado = numero1 - numero2;
        System.out.println("A Subtração Dos Números: " + resultado);
    }

    public static void multiplicacao(int numero1, int numero2 ){
        int resultado = numero1 * numero2;
        System.out.println("A Multiplicacao Dos Números: " + resultado);
    }

    public static void divisao(int numero1, int numero2 ){
        double resultado = numero1 / numero2;
        System.out.println("A Divisão Dos Números: " + resultado);
    }

}
