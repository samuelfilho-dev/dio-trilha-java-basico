package map.exercicio01;

import java.util.*;

/**
 * Dada a população estimada de alguns estados do NE brasileiro, faça:
 * Estado = PE - População = 9.616.621
 * Estado = AL - População = 3.351.543
 * Estado = CE - População = 9.187.103
 * Estado = RN - População = 3.534.265
 * Crie um dicionário e relacione os estados e suas populações;
 * Substitua a população do estado do RN por 3.534.165;
 * Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277;
 * Exiba a população PE;
 * Exiba todos os estados e suas populações na ordem que foi informado;
 * Exiba os estados e suas populações em ordem alfabética;
 * Exiba o estado com o menor população e sua quantidade;
 * Exiba o estado com a maior população e sua quantidade;
 * Exiba a soma da população desses estados;
 * Exiba a média da população deste dicionário de estados;
 * Remova os estados com a população menor que 4.000.000;
 * Apague o dicionário de estados;
 * Confira se o dicionário está vazio.
 *
 * @author Samuel Marques
 */

public class Estados {
    public static void main(String[] args) {

        //TODO: Crie um dicionário e relacione os estados e suas populações
        Map<String, Long> estadosBrasileros = new HashMap<>() {{
            put("PE", 9616621L);
            put("AL", 3351543L);
            put("CE", 9187103L);
            put("RN", 3534265L);
        }};

        System.out.println("--\tDicionário Dos Estado Brasilerios\t--");
        System.out.println(estadosBrasileros);
        System.out.println("\n");

        // TODO: Substitua a população do estado do RN por 3.534.165
        estadosBrasileros.put("RN", 3534165L);
        System.out.println("--\tEstado do RN com a População Trocada\t--");
        System.out.println(estadosBrasileros);
        System.out.println("\n");

        // TODO: Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277
        if (estadosBrasileros.containsKey("PB")) {
            System.out.println(true);
        } else {
            estadosBrasileros.put("PB", 4039277L);
        }
        System.out.println("--\tAdição do Estado PB\t--");
        System.out.println(estadosBrasileros);
        System.out.println("\n");

        // TODO: Exiba a população PE
        System.out.println("--\tPopulação do Estado de PE\t--");
        System.out.println(estadosBrasileros.get("PE"));
        System.out.println("\n");

        // TODO: Exiba todos os estados e suas populações na ordem que foi informado
        System.out.println("--\tPopulaçãoes do Estados Na Ordem De Informação\t--");
        Map<String, Long> estadosBrasileros2 = new LinkedHashMap<>() {{
            put("PE", 9616621L);
            put("AL", 3351543L);
            put("CE", 9187103L);
            put("RN", 3534265L);
        }};
        System.out.println(estadosBrasileros2);
        System.out.println("\n");

        // TODO: Exiba os estados e suas populações em ordem alfabética
        System.out.println("--\tPopulaçãoes do Estados Na Ordem Alfabética\t--");
        Map<String, Long> estadosBrasileros3 = new TreeMap<>() {{
            put("PE", 9616621L);
            put("AL", 3351543L);
            put("CE", 9187103L);
            put("RN", 3534265L);
        }};
        System.out.println(estadosBrasileros3);
        System.out.println("\n");

        // TODO: Exiba o estado com o menor população e sua quantidade
        System.out.println("--\tMenor População\t--");
        Map<String, Long> estadosBrasileros4 = new HashMap<>() {{
            put("PE", 9616621L);
            put("AL", 3351543L);
            put("CE", 9187103L);
            put("RN", 3534265L);
        }};

        Long aLong = Collections.min(estadosBrasileros4.values());
        Long menorPopulacao = 0L;
        String estadoComMenorPopulacao = "";
        Set<Map.Entry<String, Long>> entrySet = estadosBrasileros4.entrySet();

        for (Map.Entry<String, Long> entry : entrySet) {
            if (entry.getValue().equals(aLong)) {
                menorPopulacao = entry.getValue();
                estadoComMenorPopulacao = entry.getKey();
            }
        }

        System.out.println(estadoComMenorPopulacao + " - " + menorPopulacao);
        System.out.println("\n");

        // TODO: Exiba o estado com a maior população e sua quantidade;
        System.out.println("--\tMaior População\t--");
        Long max = Collections.max(estadosBrasileros4.values());
        Set<Map.Entry<String, Long>> entrySet1 = estadosBrasileros4.entrySet();

        Long maiorPopulacao = 0L;
        String estadoComMaiorPouplacao = "";

        for (Map.Entry<String, Long> longEntry : entrySet1) {
            if (longEntry.getValue().equals(max)) {
                estadoComMaiorPouplacao = longEntry.getKey();
                maiorPopulacao = longEntry.getValue();
            }
        }

        System.out.println(estadoComMaiorPouplacao + " - " + maiorPopulacao);
        System.out.println("\n");

        // TODO: Exiba a soma da população desses estados
        System.out.println("--\tSoma Da População\t--");
        Iterator<Long> iterator = estadosBrasileros4.values().iterator();
        Long soma = 0L;
        while (iterator.hasNext()){
            soma += iterator.next();
        }

        System.out.println(soma);
        System.out.println("\n");

        // TODO: Exiba a média da população deste dicionário de estados
        System.out.println("--\tMédia Da População\t--");
        System.out.println(soma / estadosBrasileros4.size());
        System.out.println("\n");

        // TODO: Remova os estados com a população menor que 4.000.000
        System.out.println("--\tPopulação Abaixo de 4.000.000\t--");
        Iterator<Long> iterator1 = estadosBrasileros4.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next() < 4000000L) iterator1.remove();
        }
        System.out.println(estadosBrasileros4);
        System.out.println("\n");

        // TODO: Apague o dicionário de estados
        estadosBrasileros4.clear();

        // TODO: Confira se o dicionário está vazio
        System.out.println("Esta Vazio? " + estadosBrasileros4.isEmpty());
    }
}
