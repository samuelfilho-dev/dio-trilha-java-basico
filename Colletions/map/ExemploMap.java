package map;

import java.util.*;

/*
 Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
 modelo = gol - consumo = 14,4km/l
 modelo = uno - consumo = 15,6 km/l
 modelo = mobi - consumo = 16,1 km/l
 modelo = hb20 - consumo = 14,5 km/l
 modelo = kwid - consumo = 15,6 km/l
 */


public class ExemploMap {
    public static void main(String[] args) {

        // TODO: crie um Dicionário que relacione o modelo com o consumo
        Map<String, Double> carrosPopulares = new HashMap<>() {{ // HashMap<> Ordem Aleatoria dos Elementos
            put("gol", 14.4);  // .put() - Adiciona elemento na Coleção
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};

        System.out.println("Impressão do HashMap: ");
        System.out.println(carrosPopulares);
        System.out.println("\n");

        // TODO: Substitua o consumo do gol por 15,2 km/l
        System.out.println("Troca do consumo do gol por 15,2 km/l");
        carrosPopulares.put("gol", 15.6); // Uso do Método .put() para substituição de elementos na Coleção
        System.out.println(carrosPopulares);
        System.out.println("\n");

        // TODO: Confira se o Modelo Tucson está no Dicionário
        System.out.println("Modelo Tucson está no Dicionário? "
                + carrosPopulares.containsKey("tucson")); // .containsKey() - Verifica se a chave está no Dicionario
        System.out.println("\n");

        // TODO: Exiba o consumo do Uno
        System.out.println("Consumo do Uno? " + carrosPopulares.get("uno")); // .get() - Mostra o valor da chave inserida como parametro
        System.out.println("\n");

        // Exiba o terceiro modelo adicionado - HashMap não possui Indice

        // TODO: Exiba os modelos
        System.out.println("Modelos: ");
        Set<String> keySet = carrosPopulares.keySet(); // .keySet() - Retorna todas as chaves do Conjunto Map, tem retorno do Conjunto Set<>
        System.out.println(keySet);
        System.out.println("\n");

        // TODO: Exiba os consumos dos carros
        System.out.println("consumos dos carros");
        Collection<Double> doubleCollection = carrosPopulares.values(); // .values() - Retorna todos os valores do Conjunto Map, tem retorno de Collection<>
        System.out.println(doubleCollection);
        System.out.println("\n");

        // TODO: Exiba o modelo mais econômico
        Double max = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entrySet = carrosPopulares.entrySet(); // .entrySet() - Retorna a coleção inteira, tem retorno do Conjunto Set<>
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> stringDoubleEntry : entrySet) { // Criar laço for do Conjunto entrySet()
            if (stringDoubleEntry.getValue().equals(max)) modeloMaisEficiente = stringDoubleEntry.getKey();
        }

        System.out.println("Modelo mais Eficiente: " + modeloMaisEficiente + " - " + max);
        System.out.println("\n");

        // TODO: Exiba o modelo menos econômico
        Double min = Collections.min(carrosPopulares.values());
        String modelMenosEficiente = "";
        for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
            if (entry.getValue().equals(min)) modelMenosEficiente = entry.getKey();
        }
        System.out.println("Modelo Menos Eficiente: " + modelMenosEficiente + " - " + min);
        System.out.println("\n");

        // TODO: Soma Dos Consumos
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;

        while (iterator.hasNext()) {
            soma += iterator.next();
        }

        System.out.println("Soma Dos Consumos: " + soma);
        System.out.println("\n");

        // TODO: Média Dos Consumos
        System.out.println("Média Dos Consumos: " + (soma / carrosPopulares.size())); // .size() - Retorna o tamanho da Coleção
        System.out.println("\n");

        // TODO: Remova Consumo Igual a 15,6 km/l
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);
        System.out.println("\n");

        // TODO: Exiba os carros Na Ordem que foram Informado
        Map<String, Double> carrosPopulares2 = new LinkedHashMap<>() {{ // LinkedHashMap<> - Ordem na colocação de elementos
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares2);
        System.out.println("\n");

        // TODO: Exiba o dicionário ordenado pelo modelo
        Map<String, Double> carrosPopulares3 = new TreeMap<>(){{ // TreeMap<> - Ordem natural dos elementos
            put("gol",14.4);
            put("uno",15.6);
            put("mobi",16.1);
            put("hb20",14.5);
            put("kwid",15.6);
        }};

        System.out.println("Lista Ordenada: " + carrosPopulares3);
        System.out.println("\n");

        // TODO: Apague o dicionário de carros
        carrosPopulares.clear();

        // TODO: Confira se dicionário está vazio
        System.out.println("Dicionário está Vazio? " + carrosPopulares.isEmpty());

    }
}
