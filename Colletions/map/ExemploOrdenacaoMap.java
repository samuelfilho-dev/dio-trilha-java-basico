package map;

/*Dadas as seguintes informações sobre meus livros favoritos e seus autores,
crie um dicionário e ordene este dicionário:
exibindo (Nome Autor - Nome Livro);
Autor = Hawking, Stephen  - Livro = nome: Uma Breve História do Tempo. páginas: 256
Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, paginas: 408
Autor = Harari, Yuval Noah  - Livro = 21 Lições Para o Século 21, páginas: 432
*/

import java.util.*;

class Livro {

    private String nome;
    private Integer paginas;


    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> o1, Map.Entry<String, Livro> o2) {
        return o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());
    }
}

class ComparatorPagina implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> o1, Map.Entry<String, Livro> o2) {
        return Integer.compare(o1.getValue().getPaginas(), o2.getValue().getPaginas());
    }
}



public class ExemploOrdenacaoMap {
    public static void main(String[] args) {

        // TODO:  Ordem de Aleatória
        System.out.println("--\tOrdem de Aleatória\t--");
        Map<String, Livro> meusLivros = new HashMap<>() {{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};

        for (Map.Entry<String, Livro> livroEntry : meusLivros.entrySet()) {
            System.out.println(livroEntry.getKey() + " - " + livroEntry.getValue().getNome());
        }
        System.out.println("\n");

        // TODO: Ordem de Inserção
        System.out.println("--\tOrdem De Inserção\t--");
        Map<String, Livro> meusLivros2 = new LinkedHashMap<>() {{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};

        for (Map.Entry<String, Livro> livroEntry : meusLivros2.entrySet()) {
            System.out.println(livroEntry.getKey() + " - " + livroEntry.getValue().getNome());
        }
        System.out.println("\n");

        // TODO: Ordem Alfabética de Autores
        System.out.println("--\tOrdem Alfabética de Autores\t--");
        Map<String, Livro> meusLivros3 = new TreeMap<>() {{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};
        for (Map.Entry<String, Livro> livroEntry : meusLivros3.entrySet()) {
            System.out.println(livroEntry.getKey() + " - " + livroEntry.getValue().getNome());
        }
        System.out.println("\n");

        // TODO: Ordem Alfabética nomes Dos Livros
        System.out.println("--\tOrdem Alfabética nomes Dos Livros\t--");
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorNome());
        meusLivros4.addAll(meusLivros.entrySet());

        for (Map.Entry<String, Livro> livroEntry : meusLivros4) {
            System.out.println(livroEntry.getKey() + " - " + livroEntry.getValue().getNome());
        }
        System.out.println("\n");

        // TODO: Ordem números de páginas
        System.out.println("--\tOrdem números de páginas\t--");
        Set<Map.Entry<String,Livro>> meusLivros5 = new TreeSet<>(new ComparatorPagina());
        meusLivros5.addAll(meusLivros.entrySet());

        for (Map.Entry<String, Livro> livroEntry : meusLivros5) {
            System.out.println(livroEntry.getKey()+" - "+livroEntry.getValue().getNome());
        }
        System.out.println("\n");

    }
}
