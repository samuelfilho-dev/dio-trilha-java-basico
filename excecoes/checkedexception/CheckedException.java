package checkedexception;

import javax.swing.*;
import java.io.*;

public class CheckedException {
    public static void main(String[] args) {
        String nomeDoArquivo = "romances-blake-crouc.txt";

        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        } catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Revise o Nome Do Arquivo " + e.getCause());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Ocorreu Um Erro inesperado! Entre em Contato com o Suporte! ");
            e.printStackTrace();
        } finally {
            System.out.println("Chegou No Finally");
        }

        System.out.println("Apesar da exception ou não, progama continua...");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (line != null);

        bw.flush();
        br.close();

    }
}
