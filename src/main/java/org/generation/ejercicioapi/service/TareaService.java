package org.generation.ejercicioapi.service;

import org.generation.ejercicioapi.models.Tarea;

import java.util.List;

public interface TareaService {

    List<Tarea> listaDeTareas();

    Tarea guardarTarea(Tarea tareaNueva);

    void borrarTarea(Long id);

    Tarea editarTareaPorId(Long id, Tarea tareaActualizada);
}
