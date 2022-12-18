package dio.web.api.repository;

import dio.web.api.handler.BusinessException;
import dio.web.api.handler.CampoObrigatorioException;
import dio.web.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    public void save(Usuario usuario){
        if (usuario.getLogin() == null) throw new CampoObrigatorioException("Login");
        if (usuario.getPassword() == null) throw new CampoObrigatorioException("Password");

        if (usuario.getId()==null){
            System.out.println("SAVE - Recebendo o usuario na camada de repositorio");
        }else{
            System.out.println("UPDATE - Recebendo o usuario na camada repositorio");
        }

        System.out.println(usuario);
    }
    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/Id Recebendo o id: %d para excluir um usuario", id));
        System.out.println(id);
    }

    public List<Usuario> findall(){
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Samuel","123456"));
        usuarios.add(new Usuario("Lucas","505050"));
        return usuarios;
    }

    public Usuario findById(Integer id){
        System.out.println(String.format("GET/id - Recebendo o id: %d para localizar um usuario", id));
        return new Usuario("Samuel","123456");
    }

    public Usuario findByUsername(String username){
        System.out.println(String.format("FIND/username - Recebendo o username: %s para localizar um usuario", username));
        return new Usuario("Samuel","123456");
    }

}
