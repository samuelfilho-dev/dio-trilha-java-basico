package dio.aulaspringdatajpa;

import dio.aulaspringdatajpa.model.User;
import dio.aulaspringdatajpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class StartApp implements CommandLineRunner {

    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {

        User user = new User();
        user.setName("Samuel");
        user.setUsername("sna_3264");
        user.setPassword("dio123");

        repository.save(user);


        for (User u: repository.findAll()){
            System.out.println(u);
        }
    }
}
