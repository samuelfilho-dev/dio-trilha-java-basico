// Classe Principal
public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("Fusca");
        carro1.setCapaciadadeDoTanque(59);


        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapaciadadeDoTanque());
        System.out.println(carro1.totalValorDoTanque(6.39));

        Carro carro2 = new Carro("Cinza", "Mecedez Benz Classe C", 66);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapaciadadeDoTanque());
        System.out.println(carro2.totalValorDoTanque(6.46));

    }
}
