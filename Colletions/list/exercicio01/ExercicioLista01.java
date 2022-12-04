package list.exercicio01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


/**
 *
 * Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
 * Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
 * e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
 *
 * @author  Samuel Marques
 *
 */


public class ExercicioLista01 {
    public static void main(String[] args) {

        Double temperatura = 0d,soma = 0d;;

        Scanner scanner = new Scanner(System.in);
        List<Double> listaDeTemperatura = new ArrayList<>();


        // Adicionando Temperatura Na Lista
        while (listaDeTemperatura.size() < 6) {
            System.out.println("Temperatura: ");
            temperatura = scanner.nextDouble();
            listaDeTemperatura.add(temperatura);
        }

        // Impressão Da lista da Temperatura
        System.out.println("Temperaturas: \t" + listaDeTemperatura);

        // Calculo Da Média Da Temperatura
        Iterator<Double> iterator = listaDeTemperatura.iterator();
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        Double media = soma / listaDeTemperatura.size();


        // Impressão da Temperatura com o Mês
        iterator = listaDeTemperatura.iterator();
        System.out.println("\n*****\t Temperaturas Acima da Média \t ******");
        for (int i = 0; i < listaDeTemperatura.size(); i++) {
            if (listaDeTemperatura.get(i) > media){
                if (listaDeTemperatura.get(i) == 1) System.out.println("1 - Janeiro: " + listaDeTemperatura.get(i));
                if (listaDeTemperatura.get(i) == 2) System.out.println("2 - Fevereiro: " + listaDeTemperatura.get(i));
                if (listaDeTemperatura.get(i) == 3) System.out.println("3 - Março: " + listaDeTemperatura.get(i));
                if (listaDeTemperatura.get(i) == 4) System.out.println("4 - Abril: " + listaDeTemperatura.get(i));
                if (listaDeTemperatura.get(i) == 5) System.out.println("5 - Maio: " + listaDeTemperatura.get(i));
                if (listaDeTemperatura.get(i) == 6) System.out.println("6 - Junho: " + listaDeTemperatura.get(i));

            }
        }


    }
}
