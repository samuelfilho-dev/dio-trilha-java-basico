package me.dio.padrao.projeto.singleton;

/***
 *  Singleton "Lazy Holder"
 *
 * @author samuelfilho-dev
 */

public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private static SingletonLazyHolder instancia;

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance(){
        if (instancia == null){
            instancia = new SingletonLazyHolder();
        }

        return instancia;
    }

}
