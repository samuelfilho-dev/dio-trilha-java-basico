package SmartTV;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }
    public void Desligar(){
        ligada = false;
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o Volume para: " + volume);

    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Dimenuir o Volume para: " + volume);
    }

    public void aumentarCanal(){
        canal++;
    }

    public void dimenuirCanal(){
        canal--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}
