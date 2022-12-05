package exceptioncustomizada;

import javax.swing.*;
import java.io.*;

public class ExceptionCustomizada1 {
    public static void main(String[] args) {
        String nomeDoArquivo = JOptionPane.showInputDialog("Nome Do Arquivo a Ser exibido: ");

        imprimirArquivoNoConsole(nomeDoArquivo);
        System.out.println("\nApesar da exception ou não, progama continua...");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) {

        try {
            BufferedReader br = lerArquivo(nomeDoArquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);
            bw.flush();
            br.close();
            line = br.readLine();
        } catch (ImpossivelAberturaDeArquivoExeception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um Erro não Esperado, por favor, entre em contato com o suporte!" + e.getMessage());
        }

    }

    public static BufferedReader lerArquivo(String nomeDoArquivo) throws ImpossivelAberturaDeArquivoExeception {
        File file = new File(nomeDoArquivo);
        try {
            return new BufferedReader(new FileReader(nomeDoArquivo));
        } catch (FileNotFoundException e) {
            throw new ImpossivelAberturaDeArquivoExeception(file.getName(), file.getPath()); // .getPath() - Retorna O Diretorio Do Arquivo
        }
    }

}


class ImpossivelAberturaDeArquivoExeception extends Exception {

    private String nomeDoArquivo;
    private String diretorio;

    public ImpossivelAberturaDeArquivoExeception(String nomeDoArquivo, String diretorio) {
        super("O Arquivo: " + nomeDoArquivo + "Não Foi Encontrado no Diretorio " + diretorio);
        this.nomeDoArquivo = nomeDoArquivo;
        this.diretorio = diretorio;

    }

    @Override
    public String toString() {
        return "{" +
                "nomeDoArquivo='" + nomeDoArquivo + '\'' +
                ", diretorio='" + diretorio + '\'' +
                '}';
    }

}
