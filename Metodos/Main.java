/**
 * @author Samuel Marques
 * */

// Classe Principal

public class Main {
    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercicio Calculadora ");
        Calculadora.soma(3,6);
        Calculadora.subtracao(9,5);
        Calculadora.multiplicacao(7,8);
        Calculadora.divisao(5,2);

        // Mensagem
        System.out.println("\nExercicio Mensagem ");
        Mensagem.obterMesagem(9);
        Mensagem.obterMesagem(14);
        Mensagem.obterMesagem(1);

        // Calculo Do Emprestimo
        System.out.println("\nExercicio Emprestimo ");
        Emprestimo.calcularEmprestimo(1000,Emprestimo.getDuasPacelas());
        Emprestimo.calcularEmprestimo(1000,Emprestimo.getTresPacelas());
        Emprestimo.calcularEmprestimo(1000,5);

        // Exercicio da Sobrecarga
        System.out.println("\nExercicio Quadrilatero ");
        Quadrilatero.area(3);
        Quadrilatero.area(5,5);
        Quadrilatero.area(7,8,9);
        Quadrilatero.area(5f,5f);

        // Exercicio de Retorno
        System.out.println("\n Exercicio Retorno ");

        double areaQuadrado = QuadrilateroComRetorno.area(3);
        System.out.println("Área Do Quadrado: " + areaQuadrado);

        double areaRetangulo = QuadrilateroComRetorno.area(5d,5d);
        System.out.println("Área Do Retangulo: " + areaRetangulo);

        double areaTrapezio = QuadrilateroComRetorno.area(7,8,9);
        System.out.println("Área Do Trapezio: " + areaTrapezio);

        float areaLosango = QuadrilateroComRetorno.area(5f,5f);
        System.out.println("Área do Losango: " + areaLosango);
    }
}
