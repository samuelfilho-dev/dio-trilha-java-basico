import javax.swing.*;

// Divisão de Números Inteiros

public class UncheckedException {
    public static void main(String[] args) {

        boolean continueLooping = true;

        do {

            String a = JOptionPane.showInputDialog("Númerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            // try - Declara o Bloco De Código do Exception
            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado:" + resultado);
                continueLooping = false;
                // catch - Declara o Bloco De Código que executara caso o Exception ocorra
            } catch (NumberFormatException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Entrada Invalida Informe um número inteiro! " + e.getLocalizedMessage());
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Impossivel Dividir Um Número Por 0!");
            } finally { // finally - Facultativo, Declara o Bloco De Código independete se ocorra Exception ou não
                System.out.println("Chegou No Finally");
            }

        } while (continueLooping);


        System.out.println("Código Continua");

    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}
