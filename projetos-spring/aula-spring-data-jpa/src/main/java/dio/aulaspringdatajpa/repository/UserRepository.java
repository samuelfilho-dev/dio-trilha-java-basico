package dio.aulaspringdatajpa.repository;

import dio.aulaspringdatajpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer>{

    //Query Override - Comando SQL Bruto
    @Query("SELECT u FROM User u WHERE u.name LIKE %:name%")
    List<User> filtrarPorNome(@Param("name") String name);

    //Query Method - O Spring JPA traduz a linguagem Java para SQL
    List<User> findByNameContaining(String name);
}
