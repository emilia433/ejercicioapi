package org.generation.ejercicioapi.controllers;

import org.generation.ejercicioapi.models.Usuario;
import org.generation.ejercicioapi.service.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioRestController {

    @Autowired
    UsuarioServiceImpl usuarioService;

    @GetMapping("/lista")
    public List<Usuario> listaDeUsuarios() {
        List<Usuario> listaMostrar = usuarioService.listaDeUsuarios();
        return listaMostrar;
    }

    @PostMapping("/nuevo")
    public Usuario crearUsuario(@RequestBody Usuario usuarioNuevo) {
        return usuarioService.guardarUsuario(usuarioNuevo);
    }

    @PutMapping("/editar")
    public Usuario editarUsuarioPorId(@RequestParam Long id, @RequestBody Usuario usuarioActualizado) {
        Usuario usuarioEditado = usuarioService.editarUsuarioPorId(id, usuarioActualizado);
        return usuarioEditado;
    }


    @DeleteMapping("/borrar")
    public String borrarUsuarioPorId(@RequestParam Long id) {
        usuarioService.borrarUsuario(id);
        return "El usuario ha sido borrado";
    }
}
