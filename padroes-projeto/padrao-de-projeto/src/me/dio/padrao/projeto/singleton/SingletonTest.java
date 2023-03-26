package me.dio.padrao.projeto.singleton;

public class SingletonTest {
    public static void main(String[] args) {

        // Testes Relacionado ao Design Pattern Singleton

        // Teste Do Singleton Lazy
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        // Teste Do Singleton Eager
        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        // Teste Do Singleton Lazy Holder
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
    }
}
