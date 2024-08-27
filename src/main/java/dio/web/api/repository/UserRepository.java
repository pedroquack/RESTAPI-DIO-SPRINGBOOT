package dio.web.api.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dio.web.api.handlers.BusinessException;
import dio.web.api.models.Usuario;

@Repository
public class UserRepository {
    public void save(Usuario usuario){
        if(usuario.getLogin() == null){
            throw new BusinessException("O campo login é obrigatório");
        }
        System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }
    public void update(Usuario usuario){
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
        System.out.println("teste");
    }
    public void remove(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<Usuario> listAll(){
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("gleyson","password"));
        usuarios.add(new Usuario("frank","masterpass"));
        return usuarios;
    }
    public Usuario findById(Integer id){
        System.out.println(String.format("GET/id - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario("gleyson","password");
    }
}
