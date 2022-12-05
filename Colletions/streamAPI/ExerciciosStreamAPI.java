package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        // TODO: Imprima todos os Elementos dessa Lista De String
        System.out.println("Os Elementos dessa Lista De String: ");
        //numerosAleatorios.forEach(s -> System.out.println(s)); // Uso Do Operador Lambda para impressão Da Lista
        numerosAleatorios.forEach(System.out::println); // Uso Do Metodo De Referencia para impressão Da Lista
        System.out.println("\n");

        // TODO: Pegue os 5 primeiros e coloque dentro de um Set
        numerosAleatorios.stream()
                .limit(5) // .limit() - Método que pega N números Da Coleção
                .collect(Collectors.toSet()) // .collect() - Coleta Dados e coloca em outra coleção (List, Set ou Map)
                .forEach(System.out::println); // .forEach() Impressão Do Vetor

        // TODO: Transforme esta lista De String em uma lista de Números Inteiros
        numerosAleatorios.stream()
                .map(Integer::parseInt) // .map() - Coverte os Dados dos elementos da Coleção - retorna uma nova stream
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // TODO: Pegue os Números Pares e Maiores que 2 e coloque numa lista
        List<Integer> integerList = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(integer -> integer % 2 == 0 && integer > 2) // .filter() - Método que filtra elementos de acordo com a condição
                .collect(Collectors.toList());
        System.out.println(integerList);

        // TODO: Média Dos Números
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt) // .mapToInt() - Trasforma para inteiro
                .average() // .average() - Método que Cálcula a Média do stream
                .ifPresent(System.out::println); // .ifPresent() - Verifica se valor existe , Null(Nulo)

        // TODO: Remova Números Impares
        List<Integer> integerList1 = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
        integerList1.removeIf(integer -> integer % 2 != 0);
        System.out.println(integerList1);


    }
}
