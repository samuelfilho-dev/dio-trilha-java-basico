package Heranca.upcast;

// Classe Principal da Aula 4 - Herança

public class Main {
    public static void main(String[] args) {

        // Criação do Objeto Funcionario
        Funcionario funcionario = new Funcionario();

        // Upcast
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vedendor();
        Funcionario faxineiro = new Faxineiro();

        // Downcast
        Vedendor vedendor = (Vedendor) new Funcionario();
    }
}
