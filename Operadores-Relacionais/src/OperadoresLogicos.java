public class OperadoresLogicos {
    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        // Operadores Logicos por expressoes Booleanas
        // AND
        System.out.println("b1 && b2 " + (b1 && b2));
        System.out.println("b1 && b3 " + (b1 && b3));

        // OR
        System.out.println("b2 || b3 " + (b2 || b3));
        System.out.println("b2 || b4 " + (b2 || b4));

        // XOR
        System.out.println("b1 ^ b3 " + (b1 ^ b3));
        System.out.println("b4 ^ b1 " + (b4 ^ b1));

        //NOT
        System.out.println(!b1);
        System.out.println(!b2);

        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;
        System.out.println("(((i1 + i2) < (f2 - f1)) && true " +(((i1 + i2) < (f2 - f1)) && true));
        System.out.println("(i1 > i2) || (f2 < f1) " + ((i1 > i2) || (f2 < f1)));

        double salarioMensal = 1189.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));

        /*
         *  Boa Pratica de progamação
         *   - Criar variaveis auxiliares para as expressoes logicas
         *   - Encurtar expressoes logicas
         *   - Facilita do entendimento
         *   - Reuso das expressoes
         * */

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitoDependentes = quantidadeDependentes >= mediaDependentes;

        System.out.println((salarioBaixo) && (muitoDependentes));

        boolean recebeAuxilio = (salarioBaixo && muitoDependentes);
        System.out.println("recebeAuxilio" + recebeAuxilio); // Colocado em apenas uma expressao

    }
}
