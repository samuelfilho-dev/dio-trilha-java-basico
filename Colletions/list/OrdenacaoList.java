package list;

/*Dadas as seguintes informações sobre meus gatos, crie uma lista
e ordene esta lista exibindo:
(nome - idade - cor);

Gato 1 = nome: Jon, idade: 18, cor: preto
Gato 2 = nome: Simba, idade: 6, cor: tigrado
Gato 3 = nome: Jon, idade: 12, cor: amarelo

*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Gato implements Comparable<Gato> {
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato gato1, Gato gato2) {
        int nome = gato1.getNome().compareToIgnoreCase(gato2.getNome());
        if (nome != 0) return nome;

        int cor = gato1.getCor().compareToIgnoreCase(gato2.getCor());
        if (cor != 0) return cor;

        return Integer.compare(gato1.getIdade(),gato2.getIdade());
    }
}


public class OrdenacaoList {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon",12,"Preto"));
            add(new Gato("Simba",6,"Tigrado"));
            add(new Gato("Jon",18,"Amarelo"));
        }};

        // TODO: Ordem De Inserção
        System.out.println("--\t Ordem de Inserção\t---");
        System.out.println(meusGatos);

        // TODO: Ordem Aleatória
        System.out.println("--\t Ordem de Aleatória\t---");
        Collections.shuffle(meusGatos); // .shuffle - Cria ordem Aleatoria do Vetor
        System.out.println(meusGatos);

        // TODO: Ordem Natural
        System.out.println("--\t Ordem Natural (Nome)\t---");
        Collections.sort(meusGatos); // .sort - Ordena a Lista
        System.out.println(meusGatos);

        // TODO: Ordem Idade
        System.out.println("--\t Ordem Idade\t---");
        Collections.sort(meusGatos,new ComparatorIdade());
        System.out.println(meusGatos);

        // TODO: Ordem Cor
        System.out.println("--\t Ordem Cor\t---");
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        // TODO: Ordem Nome/Cor/Idade
        System.out.println("--\t Ordem Nome/Cor/Idade\t---");
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);

    }
}
