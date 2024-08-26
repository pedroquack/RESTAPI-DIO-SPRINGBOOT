package dio.web.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.web.api.models.Usuario;
import dio.web.api.repository.UserRepository;






@RestController
@RequestMapping("/users")
public class UsuarioController {
    @Autowired
    private UserRepository repository;

    @GetMapping()
    public List<Usuario> getUsers() {
        return repository.listAll();
    }

    @GetMapping("/{id}")
    public Usuario getOne(@PathVariable("id") Integer id){
        return repository.findById(id);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        repository.remove(id);
    }
    
    @PostMapping()
    public void post(@RequestBody Usuario usuario){
        repository.save(usuario);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") Integer id, @RequestBody Usuario usuario){
        repository.update(usuario);
    }
}
