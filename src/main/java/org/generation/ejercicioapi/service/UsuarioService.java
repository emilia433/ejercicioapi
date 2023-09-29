package org.generation.ejercicioapi.service;

import org.generation.ejercicioapi.models.Usuario;

import java.util.List;

public interface UsuarioService {

    List<Usuario> listaDeUsuarios();

    Usuario guardarUsuario(Usuario usuarioNuevo);

    void borrarUsuario(Long id);

    Usuario editarUsuarioPorId(Long id, Usuario usuarioActualizado);
}
