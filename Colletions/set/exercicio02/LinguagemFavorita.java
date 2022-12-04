package set.exercicio02;

import java.util.Objects;

public class LinguagemFavorita implements Comparable<LinguagemFavorita> {
    private String nome;
    private Integer anoDeCriação;
    private String IDE;

    public LinguagemFavorita(String nome, Integer anoDeCriação, String IDE) {
        this.nome = nome;
        this.anoDeCriação = anoDeCriação;
        this.IDE = IDE;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAnoDeCriação() {
        return anoDeCriação;
    }

    public String getIDE() {
        return IDE;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", anoDeCriação='" + anoDeCriação + '\'' +
                ", IDE='" + IDE + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return nome.equals(that.nome) && anoDeCriação.equals(that.anoDeCriação) && IDE.equals(that.IDE);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriação, IDE);
    }

    @Override
    public int compareTo(LinguagemFavorita lf1) {
        return this.getNome().compareTo(lf1.getNome());
    }
}
