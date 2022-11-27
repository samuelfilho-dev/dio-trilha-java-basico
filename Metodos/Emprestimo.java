/**
 * @author Samuel Marques
 * */


public class Emprestimo {

    public static int getDuasPacelas(){
        return 2;
    }

    public static int getTresPacelas(){
        return 3;
    }

    public static double getTaxaDuasPacelas(){
        return 0.3;
    }

    public static double getTaxaTresPacelas(){
        return 0.45;
    }

    public static void calcularEmprestimo(double valor, int pacelas){
        if (pacelas == 2){
            double valorFinal = valor + (valor * getTaxaDuasPacelas());
            System.out.println("Valor de Emprestimo de Duas Pacelas: " + valorFinal);
        }else if (pacelas == 3){
            double valorFinal = valor + (valor * getTaxaTresPacelas());
            System.out.println("Valor de Emprestimo de Três Pacelas: " + valorFinal);
        }else{
            System.out.println("Quantidade de Parcelas Incorreta");
        }
    }

}
