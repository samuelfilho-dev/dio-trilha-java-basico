package me.dio.padrao.projeto.strategy;

public class ComportamentoAgressivo implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Movendo-se Agresivamente...");
    }
}
