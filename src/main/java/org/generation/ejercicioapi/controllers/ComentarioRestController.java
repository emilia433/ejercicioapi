package org.generation.ejercicioapi.controllers;

import org.generation.ejercicioapi.models.Comentario;
import org.generation.ejercicioapi.service.ComentarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comentario")
public class ComentarioRestController {

    @Autowired
    ComentarioServiceImpl comentarioService;

    @GetMapping("/lista")
    public List<Comentario> listaDeComentarios() {
        List<Comentario> listaMostrar = comentarioService.listaDeComentarios();
        return listaMostrar;
    }

    @PostMapping("/nuevo")
    public Comentario crearComentario(@RequestBody Comentario comentarioNuevo) {
        return comentarioService.guardarComentario(comentarioNuevo);
    }

    @PutMapping("/editar")
    public Comentario editarComentarioPorId(@RequestParam Long id, @RequestBody Comentario comentarioActualizado) {
        Comentario comentarioEditado = comentarioService.editarComentarioPorId(id, comentarioActualizado);
        return comentarioEditado;
    }


    @DeleteMapping("/borrar")
    public String borrarComentarioPorId(@RequestParam Long id) {
        comentarioService.borrarComentario(id);
        return "El Comentario ha sido borrado.";
    }
}

