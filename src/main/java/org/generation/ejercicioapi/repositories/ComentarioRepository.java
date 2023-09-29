package org.generation.ejercicioapi.repositories;

import org.generation.ejercicioapi.models.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComentarioRepository extends JpaRepository<Comentario, Long> {
}
