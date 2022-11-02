public class OperadoresRelacionais {
    public static void main(String[] args) {

        // Variaveis
        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        double d1 = 59.6d;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "Fulano";
        String s2 = "Fulano";
        String s3 = "Cicrano";
        boolean b1 = true;
        boolean b2 = false;

        long l1 = 1597L;
        long l2 = 8997L;
        byte y1= 1;
        short h1 = 25;

        // Comparações entre o Inteiro 1 e Inteiro2 (i1,i2)

        System.out.println("i1 == i2 " + (i1 == i2)); // Igual
        System.out.println("i1 != i2 " + (i1 != i2)); // Diferente
        System.out.println("i1 > i2 " + (i1 > i2)); // Maior
        System.out.println("i1 <= i2 " + (i1 <= i2)); // Menor ou igual

        // Comparações entre o Numero flutuante 1 e Numero flutuante 2 (f1,f2)

        System.out.println("f1 == f2 "+ (f1 == f2)); // Igual
        System.out.println("f1 != f2 "+ (f1 != f2)); // Diferente
        System.out.println("f1 >= f2 "+ (f1 >= f2)); // Maior ou igual
        System.out.println("f1 < f2 "+ (f1 < f2)); // Menor

        // Comparações entre o Caractere 1 e Caractere 2 (c1,c2)

        System.out.println("c1 == c2 " + (c1 == c2)); // Igual
        System.out.println("c1 != c2 " + (c1 != c2)); // Diferente
        System.out.println("c1 > c2 " + (c1 > c2)); // Maior
        System.out.println("c1 <= c2 " + (c1 <= c2)); // Menor ou igual

        // Comparações entre o texto 1 e texto 2 (s1,s2)

        System.out.println("s1 == s2 " + (s1 == s2)); // Igual
        System.out.println("s1 == s3 " + (s1 == s3)); // Igual
        System.out.println("s1 != s2 " + (s1 != s2)); // Diferente
        //System.out.println(s1 >= s2); // ERRO - a Variavel string não pode ter operadores relacionais de tamanho
        //System.out.println(s1 < s2); // ERRO - a Variavel string não pode ter operadores relacionais de tamanho

        //Comparações entre o booleano 1 e booleano 2 (b1,b2)

        System.out.println("b1 == b2 " + (b1 == b2));
        System.out.println("b1 == b2 " + (b1 == b2));
        //System.out.println(b1 > b2); // ERRO - a Variavel Booleano não pode ter operadores relacionais de tamanho
        //System.out.println(b1 <= b2); ERRO - a Variavel Booleano não pode ter operadores relacionais de tamanho

        // Comparações entre Variaveis

        System.out.println("i2 > f1 " + (i2 > f1));
        System.out.println("i2 == f1 " + (d1 == h1));
        //System.out.println(s2 != c1); // ERRO - Não pode comparação entre Char e String
        //System.out.println(s3 != i1); // ERRO - Não pode comparação entre String e Inteiro
        System.out.println("l1 == i2 " + (l1 == i2));
        System.out.println("l2 >= i1 " + (l2 >= i1));
        System.out.println("y1 != h1 " + (y1 != h1));

    }
}
