public class Operadores {

    public static void main(String[] args) {

        // Aula 2 - Operação Aritmética

        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        //qual o resultado das expressoes abaixo?
        String concatenacao = "?";
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);
        // Quando usa concatenacao, "+" não é usado para
        // finalidade Aritmética

        //Aula 2 - Operação Unária

        // Tornar Negativo
        int numero = 5;
        numero = -numero;
        System.out.println(numero);

        // Tornar Positvo
        numero = numero * -1;
        System.out.println(numero);

        // Incremento
        numero = 5;
        System.out.println(++numero); // numero = numero + 1;

        // Incremento
        numero = 5;
        System.out.println(--numero); // numero = numero - 1;

        // Negação
        boolean variavel = true;
        variavel = !variavel;
        System.out.println(variavel);  // ! -> Negação - Inverter um valor Booleano

        // Aula 2 - Operação Ternária

        // classe Operadores.java
        int a, b;
        a = 6;
        b = 6;

        String resultado = a==b ? "Verdadeiro" : "Falso";


        System.out.println(resultado);

        // Aula 2 - Operadores Relacionais

        String nomeUm = "SAMUEL";
        String nomeDois = new String("SAMUEL");

        System.out.println(nomeUm.equals(nomeDois));

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        // Pode ser usado em IF...ELSE
        if(numero1 == numero2){
            System.out.println("A nossa condição é verdadeira");
        }

        System.out.println("NúmeroUm é Igual a NumeroDois? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("NúmeroUm é Diferente a NumeroDois? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("NúmeroUm é Maior a NumeroDois? " + simNao);

        // Aula 2 - Operadores Lógicos

        boolean condicao1=true;
        boolean condicao2=true;

        if (condicao1 && condicao2){
            System.out.println("As duas das condições São Verdadeiras");
        }

        if (condicao1 || condicao2){
            System.out.println("Uma das condições São Verdadeiras");
        }
        if (condicao1 && (7 > 4)){
            System.out.println("As duas das condições São Verdadeiras");
        }

        System.out.println("Fim");
    }
}
