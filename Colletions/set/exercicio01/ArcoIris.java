package set.exercicio01;

import java.util.*;

/**
 * Crie um conjunto contendo as cores do arco-íris e:
 *  Exiba todas as cores uma abaixo da outra
 *  A quantidade de cores que o arco-íris tem
 *  Exiba as cores em ordem alfabética
 *  Exiba as cores na ordem inversa da que foi informada
 *  Exiba todas as cores que começam com a letra ”v”
 *  Remova todas as cores que não começam com a letra “v”
 *  Limpe o conjunto
 *  Confira se o conjunto está vazio
 *
 * @author Samuel Marques
 *
 * */

public class ArcoIris {
    public static void main(String[] args) {
        Set<String> coresDoArcoIris = new TreeSet<>();
        coresDoArcoIris.add("Vermelha");
        coresDoArcoIris.add("Laranja");
        coresDoArcoIris.add("Amarela");
        coresDoArcoIris.add("Verde");
        coresDoArcoIris.add("Azul");
        coresDoArcoIris.add("Azul-escuro");
        coresDoArcoIris.add("Violeta");

        // TODO: Exiba todas as cores uma abaixo da outra
        System.out.print("\nCores Do Arco Iris: \n");
        for (String cores : coresDoArcoIris) {
            System.out.print(cores + "\n");
        }

        System.out.println("\n");

        // TODO: A quantidade de cores que o arco-íris tem
        System.out.println("Quantidade De Cores: " + coresDoArcoIris.size());

        System.out.println("\n");

        // TODO: Exiba as cores em ordem alfabética
        System.out.println("Cores Em Ordem Alfabética: \n" + coresDoArcoIris);

        System.out.println("\n");

        // TODO: Exiba as cores na ordem inversa da que foi informada
        List<String> listaCoresDoArcoIris = new ArrayList<>(coresDoArcoIris);
        Collections.reverse(listaCoresDoArcoIris);
        System.out.println("Conjunto Inverso: \n" + listaCoresDoArcoIris);

        System.out.println("\n");

        // TODO: Exiba todas as cores que começam com a letra ”v”
        System.out.println("Cores Do Arco Iris Que Começam Com V: ");
        for (String corDoArcoIris : coresDoArcoIris) {
            if (corDoArcoIris.startsWith("V")) System.out.println(corDoArcoIris);
        }

        System.out.println("\n");

        // TODO: Remova todas as cores que não começam com a letra “v”
        Iterator<String> iterator = coresDoArcoIris.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            if (next.startsWith("V")) iterator.remove();
        }
        System.out.println("Cores Do Arco Iris Sem V: ");
        System.out.println(coresDoArcoIris);
        System.out.println("\n");

        // TODO: Limpe o conjunto
        coresDoArcoIris.clear();
        System.out.println("Conjunto Limpo: " + coresDoArcoIris);
        System.out.println("\n");

        // TODO: Confira se o conjunto está vazio
        System.out.println("Está vazio? " + coresDoArcoIris.isEmpty());

    }
}
