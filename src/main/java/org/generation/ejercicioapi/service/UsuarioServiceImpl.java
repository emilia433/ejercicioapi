package org.generation.ejercicioapi.service;

import jakarta.transaction.Transactional;
import org.generation.ejercicioapi.models.Usuario;
import org.generation.ejercicioapi.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;


    @Override
    public List<Usuario> listaDeUsuarios() {
        return usuarioRepository.findAll();
    }


    @Override
    public Usuario guardarUsuario(Usuario usuarioNuevo) {
        return usuarioRepository.save(usuarioNuevo);
    }

    @Override
    public void borrarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public Usuario editarUsuarioPorId(Long id, Usuario usuarioActualizado) {
        Boolean existe = usuarioRepository.existsById(id);
        if (existe) {
            Usuario usuarioSelecccionado = usuarioRepository.findById(id).get();
            usuarioSelecccionado.setNombreUsuario(usuarioActualizado.getNombreUsuario());
            usuarioSelecccionado.setCorreoUsuario(usuarioSelecccionado.getCorreoUsuario());
            return usuarioRepository.save(usuarioSelecccionado);
        } else {
            System.out.println("El usuario no existe o el ID es incorrecto.");
            return null;
        }

    }
}
