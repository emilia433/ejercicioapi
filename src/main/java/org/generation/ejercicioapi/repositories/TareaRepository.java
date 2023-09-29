package org.generation.ejercicioapi.repositories;

import org.generation.ejercicioapi.models.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareaRepository extends JpaRepository<Tarea, Long> {
}
