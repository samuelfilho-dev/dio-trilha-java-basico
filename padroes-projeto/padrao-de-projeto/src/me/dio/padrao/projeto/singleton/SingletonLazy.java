package me.dio.padrao.projeto.singleton;

/***
 *  Singleton "Preguiçoso"
 *
 * @author samuelfilho-dev
 */

public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstance(){
        if (instancia == null){
            instancia = new SingletonLazy();
        }

        return instancia;
    }
}
