import java.util.Scanner;

/**
 * @author: Samuel Marques
 * */

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/

public class Ex1_NomeEidade {
    public static void main(String[] args) {

        // Declaração de Variaveis
        String nome = "nome";
        int idade;

        while (true){

            // Usando Comando de Entrada de Dados (Scanner)
            Scanner scanner = new Scanner(System.in);

            // Entrada do Nome
            System.out.println("Qual é Seu Nome: ");
            nome = scanner.next();


            // Verificão do nome
            if (nome.equals("0")){
                break;
            }

            // Entrada da Idade
            System.out.println("Qual é sua Idade: ");
            idade = scanner.nextInt();
            System.out.println("\n");

            // Impressão
            System.out.println("Nome: " + nome);
            System.out.println("Idade:" + idade);
            System.out.println("\n");

        }

        System.out.println("Fim do progama");

    }
}
