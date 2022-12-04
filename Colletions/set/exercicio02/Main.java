package set.exercicio02;

import java.util.*;

/**
 * Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e ide.
 * Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
 * Ordem de Inserção
 * Ordem Natural (nome)
 * IDE
 * Ano de criação e nome
 * Nome, ano de criacao e IDE
 * Ao final, exiba as linguagens no console, um abaixo da outra.
 *
 * @author Samuel Marques
 *
 */


class ComparatorIDE implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        return lf1.getIDE().compareTo(lf2.getIDE());
    }
}

class ComparatorNomeAnoDeCriacaoIDE implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {

        int nome = lf1.getNome().compareTo(lf2.getNome());
        if (nome != 0) return nome;

        int anoDeCriacao = Integer.compare(lf1.getAnoDeCriação(), lf2.getAnoDeCriação());
        if (anoDeCriacao != 0) return anoDeCriacao;

        return lf1.getIDE().compareTo(lf2.getIDE());
    }
}


public class Main {
    public static void main(String[] args) {
        Set<LinguagemFavorita> conjuntoDaLinguagemFavorita = new LinkedHashSet<>() {{
            add(new LinguagemFavorita("Java", 1990, "InteliJ"));
            add(new LinguagemFavorita("PHP", 2005, "PHPStrom"));
            add(new LinguagemFavorita("COBOL", 1800, "EMBRIAC"));
        }};

        // Ordem de Inserção
        System.out.println(" ===\t Ordem De Inserção:  \t=== ");
        for (LinguagemFavorita linguagemFavorita : conjuntoDaLinguagemFavorita) {
            System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriação() + " - " + linguagemFavorita.getIDE());
        }
        System.out.println("\n");

        //Ordem Natural (nome)
        System.out.println(" ===\t Ordem Natural (nome)  \t=== ");
        Set<LinguagemFavorita> conjuntoDaLinguagemFavorita2 = new TreeSet<>(conjuntoDaLinguagemFavorita);
        for (LinguagemFavorita linguagemFavorita : conjuntoDaLinguagemFavorita2) {
            System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriação() + " - " + linguagemFavorita.getIDE());
        }
        System.out.println("\n");

        // Ordem IDE
        System.out.println(" ===\t Ordem IDE \t=== ");
        Set<LinguagemFavorita> conjuntoDaLinguagemFavorita3 = new TreeSet<>(new ComparatorIDE());
        conjuntoDaLinguagemFavorita3.addAll(conjuntoDaLinguagemFavorita);
        for (LinguagemFavorita linguagemFavorita : conjuntoDaLinguagemFavorita3) {
            System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriação() + " - " + linguagemFavorita.getIDE());
        }
        System.out.println("\n");


        // Ordem Nome, ano de criacao e IDE
        System.out.println(" ===\t Ordem Nome/ano de criacao/IDE \t=== ");
        Set<LinguagemFavorita> conjuntoDaLinguagemFavorita4 = new TreeSet<>(new ComparatorNomeAnoDeCriacaoIDE());
        conjuntoDaLinguagemFavorita4.addAll(conjuntoDaLinguagemFavorita);
        for (LinguagemFavorita linguagemFavorita : conjuntoDaLinguagemFavorita4) {
            System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriação() + " - " + linguagemFavorita.getIDE());
        }
        System.out.println("\n");

        // Exibição Das Linguagem de Progamação
        Set<LinguagemFavorita> conjuntoDaLinguagemFavorita5 = new TreeSet<>(conjuntoDaLinguagemFavorita);
        System.out.println(" ===\t Linguagens De Progamação \t=== ");
        for (LinguagemFavorita linguagemFavorita : conjuntoDaLinguagemFavorita5) {
            System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriação() + " - " + linguagemFavorita.getIDE() + "\n");
        }


    }





}
