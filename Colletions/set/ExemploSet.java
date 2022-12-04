package set;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {

        // TODO: Crie um Conjunto e Adicione as Notas
        Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6)); // Criando um Set
        System.out.println(notas.toString());

        //Exiba a posição da nota 5.0 - A Classe HashSet não possui com Indice
        //Substutua a nota 5.0 pela nota 6.0 - A Classe HashSet não possui com Indice
        //Substutua a nota 5.0 pela nota 6.0 - A Classe HashSet não método .set()

        // TODO: Confira se a nota 5.0 está no Conjunto
        System.out.println("Nota 5.0 está no Conjunto? " + notas.contains(5d)); // .contains() - Método verifica se tem o elemento no conjunto, retorna Boolean

        //Exiba a terceira nota Adicionada - A Classe HashSet não método .get()

        // TODO: Exiba a menor Nota
        System.out.println("Menor Nota: " + Collections.min(notas)); //.min() , Da Classe Collections retorna o menor valor

        // TODO: Exiba a maior Nota
        System.out.println("Maior Nota: " + Collections.max(notas)); //.max() , Da Classe Collections retorna o maior valor

        // TODO: Exiba a soma dos Valores
        Iterator<Double> iterator = notas.iterator(); // Usando Iterator
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("Soma Do Conjunto: " + soma);

        // TODO: Exiba a média das notas
        System.out.println("Média do Conjunto: " + (soma / notas.size())); // .size() - Retorna a quantidade de elementos no Conjunto

        // TODO: Remova a nota 0
        notas.remove(0d); // . remove() - Remove elemento no Conjunto
        System.out.println(notas);

        //Remova a nota da posição 0 - A Classe HashSet não possui com Indice

        // TODO: Remova as notas menores que 7 e exiba a lista
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        // TODO: Exiba todas as notas na Ordem que Foram Informados
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        // TODO: Exiba todas as notas na Ordem Cresente
        Set<Double> notas3 = new TreeSet<>(notas2); // Cria-se uma TreeSet, pois ela ordena na Ordem Natural dos Elementos
        System.out.println(notas3);

        // TODO: Apague toda a lista
        notas.clear(); // // .clear() - Apaga o conjunto

        // TODO: Confere se a lista está vazia
        System.out.println("Está vazia? " + notas.isEmpty()); // isEmpty() - Confere se a lista está vazia retorna Boolean
        System.out.println("Está vazia? (Conjunto 2): " + notas2.isEmpty());
        System.out.println("Está vazia? (Conjunto 3): " + notas3.isEmpty());

    }
}
