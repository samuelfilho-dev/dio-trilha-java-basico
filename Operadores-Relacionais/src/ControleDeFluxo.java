/**
 * @author Samuel Marques
 * Execicio 3 - Controle de Fluxo - DIO
 * */
public class ControleDeFluxo {

    public static void main(String[] args) {

        ifMes();// Exercício 1 - IF.ELSE.IF com números do mês
        SwitchFerias(); // Exercício 2 - SWITCH...CASE com texto dos mes de ferias - possui apenas uma variavel
        swtichDiaDaSemana(); // Exercício 3 - SWITCH...CASE com os Dias Da Semana
        switchNumeros(); // Exercício 4 - SWITCH...CASE com números inteiros
    }

    public static void ifMes(){

        // IF..ELSE..IF
        int numeroMes = 8;

         if (numeroMes == 1){
            System.out.println("Janeiro");
        }
        else if (numeroMes == 2){
            System.out.println("Fevereiro");
        }
        else if (numeroMes == 3){
            System.out.println("Março");
        }
        else if (numeroMes == 4){
            System.out.println("Abril");
        }
        else if (numeroMes == 5){
            System.out.println("Maio");
        }
        else if (numeroMes == 6){
            System.out.println("Junho");
        }
        else if (numeroMes == 7){
            System.out.println("Julho");
        }
        else if (numeroMes == 8){
            System.out.println("Agosto");
        }
        else if (numeroMes == 9){
            System.out.println("Setembro");
        }
        else if (numeroMes == 10){
            System.out.println("Outubro");
        }
        else if (numeroMes == 11){
            System.out.println("Novembro");
        }
        else if (numeroMes == 12){
            System.out.println("Dezembro");
        }else{
             System.out.println("Mês Invalido");
         }
    }

    public static void SwitchFerias(){
        // SWITCH...CASE
        String mes = "julho";
        switch (mes){
            case "janeiro":
            case "julho":
            case "dezembro":
                System.out.println("Férias");
                break;
            default:
                System.out.println("Mês Invalido");
        }
    }

    public static void swtichDiaDaSemana(){
        // SWITCH...CASE
        String diaDaSemana = "segunda";
        switch (diaDaSemana){
            case "segunda":
                System.out.println(1);
                break;
            case "terca":
                System.out.println(2);
                break;
            case "quarta":
                System.out.println(3);
                break;
            case "quinta":
                System.out.println(4);
                break;
            case "sexta":
                System.out.println(5);
            case "sabado":
                System.out.println(6);
                break;
            case "domingo":
                System.out.println(7);
                break;
            default:
                System.out.println("Dia da semana não encotrado");
                break;
        }
    }
    public static void switchNumeros (){
        //SWITCH...CASE
        int numero = 4;
        switch (numero){
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Número não encontrado");
                break;
        }
    }

}

