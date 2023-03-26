package me.dio.padrao.projeto.singleton;

/***
 *  Singleton "Ansioso"
 *
 * @author samuelfilho-dev
 */

public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance(){
        return instancia;
    }
}
