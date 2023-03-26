package me.dio.padrao.projeto.strategy;

public class StrategyTest {
    public static void main(String[] args) {

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        // Comportamento Normal
        robo.mover();
        robo.mover();

        // Comportamento Agresivo
        robo.setComportamento(defensivo);
        robo.mover();

        // Comportamento
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
    }
}
