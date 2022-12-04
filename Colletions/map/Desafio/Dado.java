package map.Desafio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Faça um programa que simule um lançamento de dados.
 * Lance o dado 100 vezes e armazene.
 * Depois, mostre quantas vezes cada valor foi inserido.
 *
 * @author Samuel Marques
 */

public class Dado {
    public static void main(String[] args) {

        // Criação do Objeto Random e Da Lista
        Random random = new Random();
        List<Integer> listaDeLancamentoDeDados = new ArrayList<>();

        // População Da Lista com 100 elementos
        int contador = 0;
        while (contador < 100) {
            Integer lancamentoDeDados = random.nextInt(6) + 1;
            listaDeLancamentoDeDados.add(lancamentoDeDados);
            contador++;
        }

        // Criação de Variaveis Para demostração de valor individual
        int contadorUm = 0, contadoDois = 0, contadorTres = 0,
                contadorQuatro =0 , contadorCinco = 0, contadorSeis = 0;

        // Uso de Iterator para interação com a lista, logo a soma das variaveis de Demostração
        Iterator<Integer> iterator = listaDeLancamentoDeDados.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            switch (next){
                case 1:
                    contadorUm++;
                    break;
                case 2:
                    contadoDois++;
                    break;
                case 3:
                    contadorTres++;
                    break;
                case 4:
                    contadorQuatro++;
                    break;
                case 5:
                    contadorCinco++;
                    break;
                case 6:
                    contadorSeis++;
                    break;
                default:
                    System.out.println("Valor Incorreto");
            }
        }

        // Impressão Dos Resultados
        System.out.println("----\tContador Do Lançamento De Dados\t----");
        System.out.println("1: " + contadorUm);
        System.out.println("2: " + contadoDois);
        System.out.println("3: " + contadorTres);
        System.out.println("4: " + contadorQuatro);
        System.out.println("5: " + contadorCinco);
        System.out.println("6: " + contadorSeis);

    }
}
