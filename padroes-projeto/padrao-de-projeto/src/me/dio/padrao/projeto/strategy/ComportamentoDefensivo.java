package me.dio.padrao.projeto.strategy;

public class ComportamentoDefensivo implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Comporatamento Defensivo...");
    }
}
