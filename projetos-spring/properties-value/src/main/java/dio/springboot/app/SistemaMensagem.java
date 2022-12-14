package dio.springboot.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class SistemaMensagem implements CommandLineRunner {

    @Value("${name:NoReply-DIO}")
    private String nome;
    @Value("${email}")
    private String email;
    @Value("${telefones}")
    private List<Long> telefones = new ArrayList<>(Arrays.asList(new Long[]{1195678154L}));


    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mesagem enviada por: " + nome + "\nEmail: " + email + "\n Com telefones para contato " + telefones);
        System.out.println("Seu Cadastro Aprovado");
    }
}
