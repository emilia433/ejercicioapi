package org.generation.ejercicioapi.repositories;

import org.generation.ejercicioapi.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
