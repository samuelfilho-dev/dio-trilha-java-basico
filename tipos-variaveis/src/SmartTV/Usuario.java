package SmartTV;

public class Usuario {
    public static void main(String[] args) {

        // Declaração Objeto
        SmartTv smartTv = new SmartTv();


        // Mostrar os Parametros Padrões
        System.out.println("Volume Atual: "+ smartTv.volume);
        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: "+ smartTv.volume);

        // Método Ligar/Desligar
        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);
        smartTv.Desligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);

        // Método Canal
        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal Atual: " + smartTv.canal);

        // Método Volume
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual: "+ smartTv.volume);
    }
}
