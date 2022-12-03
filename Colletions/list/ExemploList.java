package list;

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {

        // Dada uma lista com 7 notas de aluno [7,8.5,9.3,5,7,0,3.6]

        // TODO: Crie uma lista e adicione as 7 notas
        List<Double> notas = new ArrayList<>(); // Forma de iniciar uma lista
        notas.add(7.0); // .add - Adiciona Elementos na Lista
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println(notas); // toString - Serve para a impresão da Lista

        // TODO: Exiba a posição da nota 5.0
        System.out.println("Posição da Nota 5.0: " + notas.indexOf(5d)); // Indexof - Mostra a posição de elemento

        // TODO: Adicione na lista nota 8.0 na posição 4
        notas.add(4,8.0d);
        System.out.println(notas);

        // TODO: Substutua a nota 5.0 pela nota 6.0
        notas.set(notas.indexOf(5d),6d); // .set - Substutui elementos da lista
        System.out.println(notas);

        // TODO: Confira se a nota 5.0 está na lista
        System.out.println("Nota 5? " + notas.contains(5d)); // .contains - Confere elementos na lista (Retorna Booleano)

        // TODO: Exiba as notas na ordem que foram informados
        for (Double nota : notas) {
            System.out.println(nota);
        }

        // TODO: Exiba a terceira nota Adicionada
        System.out.println("Terceira nota Adicionada: " + notas.get(2)); // .get - Passa o elemento a partir do Indice

        // TODO: Exiba a menor Nota
        System.out.println("Menor Nota: " + Collections.min(notas)); // .min , Da Classe Collections retorna o menor valor


        // TODO: Exiba a maior Nota
        System.out.println("Maior Nota: " + Collections.max(notas)); // .max , Da Classe Collections retorna o maior valor


        // TODO: Exiba a soma dos Valores
        Iterator<Double> iterator = notas.iterator(); // Criar uma variavel Do Iterator
        Double soma = 0d;
        while (iterator.hasNext()){  // .hasnext Verifica se tem o proximo elemento na Lista
            Double next = iterator.next(); // Pega o Elemento proximo
            soma += next;
        }

        System.out.println("Soma Dos Valores: " + soma);

        // TODO: Exiba a média das notas
        System.out.println("Média das notas: " + (soma / notas.size())); // .size - Retorna a quantidade de elementos na lista

        // TODO: Remova a nota 0
        notas.remove(0d); // . remove - Remove elemento na lista

        // TODO: Remova a nota da posição 0
        notas.remove(0); // Se for inteiro, entra como paramentro o index

        // TODO: Remova as notas menores que 7 e exiba a lista

        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7 ){
                iterator1.remove();
            }
        }
        System.out.println(notas);

        // TODO: Apague toda a lista
        notas.clear(); // .clear - Apaga toda a lista
        System.out.println(notas);

        // TODO: Confere se a lista está vazia
        System.out.println("Está vazia? " + notas.isEmpty()); // isEmpty - Confere se a lista está vazia retorna Boolean


        //Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList:

        // TODO: Crie uma lista chamada notas2 e coloque todos os elementos da list Arraylist nessa nova lista

        LinkedList<Double> notas2 = new LinkedList<>();
        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(7.0);
        notas2.add(0.0);
        notas2.add(3.6);
        System.out.println(notas2);

        // TODO: Mostre a primeira nota da nova lista sem removê-lo:
        System.out.println(notas2.element()); // .element - Mostra o primeiro elemento da lista

        // TODO: Mostre a primeira nota da nova lista removendo-o:
        System.out.println(notas2.pollFirst()); // .pollFirst() - Recupera e remove o primeiro elemento desta lista, ou retorna, se esta lista estiver vazia.null
        System.out.println("\n " + notas2);



    }
}
