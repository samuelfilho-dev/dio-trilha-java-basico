// Classe de exemplo do Exercicio 3
public class Carro {

    // Atributos Da Classe
    String cor;
    String modelo;
    int capaciadadeDoTanque;


    // Construtores
    Carro(){}
    Carro(String cor, String modelo, int capaciadadeDoTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capaciadadeDoTanque = capaciadadeDoTanque;
    }

    // Métodos Getter e Setter
    void setCor(String cor){
        this.cor = cor;
    }

    String getCor(){
        return cor;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }

    String getModelo(){
        return modelo;
    }

    void setCapaciadadeDoTanque(int capaciadadeDoTanque){
        this.capaciadadeDoTanque = capaciadadeDoTanque;
    }

    int getCapaciadadeDoTanque(){
        return capaciadadeDoTanque;
    }

    // Método do Valor do tanque
    double totalValorDoTanque(double valorDoCombustivel){
        return capaciadadeDoTanque * valorDoCombustivel;
    }

}
