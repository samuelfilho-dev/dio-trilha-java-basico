package list.exercicio02;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
 * "Telefonou para a vítima?"
 * "Esteve no local do crime?"
 * "Mora perto da vítima?"
 * "Devia para a vítima?"
 * "Já trabalhou com a vítima?"
 * Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita",
 * entre 3 e 4 como "Cúmplice" e 5 como "Assassina". Caso contrário, ela será classificado como "Inocente".
 */

public class ExercicioLista02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> repostas = new ArrayList<>();


        // 1ª Pergunta
        System.out.println("Telefonou para a vítima[S/N]? ");
        String R1 = scanner.next();
        repostas.add(R1);

        // 2ª Pergunta
        System.out.println("Esteve no local do crime[S/N]? ");
        String R2 = scanner.next();
        repostas.add(R2);

        // 3ª Pergunta
        System.out.println("Mora perto da vítima[S/N]? ");
        String R3 = scanner.next();
        repostas.add(R3);

        // 4ª Pergunta
        System.out.println("Devia para a vítima[S/N]? ");
        String R4 = scanner.next();
        repostas.add(R4);

        // 5ª Pergunta
        System.out.println("Já trabalhou com a vítima[S/N]? ");
        String R5 = scanner.next();
        repostas.add(R5);

        // Mostrando a Lista
        System.out.println("Lista de Respostas: " + repostas);


        // Contando a Quantidades de Sim e Não
        Iterator<String> iterator = repostas.iterator();

        Integer qtdSim = 0;
        Integer qtdNao = 0;

        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.equalsIgnoreCase("S")) {
                qtdSim++;
            } else {
                qtdNao++;
            }
        }


        // Classificando o Suspeito
        System.out.println(" =====\t Classificação Do Suspeito: \t=====");
        if (qtdSim == 1 || qtdSim == 2) System.out.println("Suspeita");
        if (qtdSim == 3 || qtdSim == 4) System.out.println("Cúmplice");
        if (qtdSim == 5) System.out.println("Assasino(a)");
        if (qtdSim == 0) System.out.println("Inocente");



    }
}
