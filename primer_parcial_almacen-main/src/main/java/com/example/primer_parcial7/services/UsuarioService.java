package com.example.primer_parcial7.services;
import com.example.primer_parcial7.models.Usuario;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UsuarioService {
    ResponseEntity<Usuario> getUserById(Long id);
    ResponseEntity<Usuario> createUser(Usuario usuario);
    ResponseEntity<List<Usuario>> allUsers();
    ResponseEntity<List<Usuario>> allUsersByName(String nombre);
    ResponseEntity<List<Usuario>> allUsersByLastName(String apellidos);
    ResponseEntity<Usuario> editUser(Long id, Usuario usuario);
    ResponseEntity<Usuario> deleteUser(Long id);


    ResponseEntity login(String correo,String password);
}