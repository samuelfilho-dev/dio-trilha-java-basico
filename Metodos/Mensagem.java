/**
 * @author Samuel Marques
 * */

// Classe das Mensagens Bom Dia, Boa Tarde e Boa Noite

public class Mensagem {

    public static void obterMesagem(int hora){

        if (hora >= 5 && hora <= 12){
            mensagemBomDia();
        }else if (hora >= 13 && hora <= 17){
            mensagemBoaTarde();
        }else{
            mensagemBoaNoite();
        }
    }

    public static void mensagemBomDia(){
        System.out.println("Bom Dia! ");
    }

    public static void mensagemBoaTarde(){
        System.out.println("Boa Tarde! ");
    }

    public static void mensagemBoaNoite(){
        System.out.println("Bom Noite! ");
    }

}
