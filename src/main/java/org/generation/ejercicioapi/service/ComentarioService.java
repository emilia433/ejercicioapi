package org.generation.ejercicioapi.service;

import org.generation.ejercicioapi.models.Comentario;

import java.util.List;

public interface ComentarioService {

    List<Comentario> listaDeComentarios();

    Comentario guardarComentario(Comentario comentarioNuevo);

    void borrarComentario(Long id);

    Comentario editarComentarioPorId(Long id, Comentario comentarioActualizado);
}
