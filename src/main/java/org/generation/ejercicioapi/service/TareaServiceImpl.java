package org.generation.ejercicioapi.service;


import jakarta.transaction.Transactional;
import org.generation.ejercicioapi.models.Tarea;
import org.generation.ejercicioapi.repositories.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class TareaServiceImpl implements TareaService {

    @Autowired
    TareaRepository tareaRepository;

    @Override
    public List<Tarea> listaDeTareas() {
        return tareaRepository.findAll();
    }

    @Override
    public Tarea guardarTarea(Tarea tareaNueva) {
        return tareaRepository.save(tareaNueva);
    }

    @Override
    public void borrarTarea(Long id) {
        tareaRepository.deleteById(id);
    }

    @Override
    public Tarea editarTareaPorId(Long id, Tarea tareaActualizada) {
        Boolean existe = tareaRepository.existsById(id);
        if (existe) {
            Tarea tareaSeleccionada = tareaRepository.findById(id).get();
            tareaSeleccionada.setTareaTitulo(tareaActualizada.getTareaTitulo());
            tareaSeleccionada.setTareaDescripcion(tareaActualizada.getTareaDescripcion());
            tareaSeleccionada.setTareaFechaDeVencimiento(tareaActualizada.getTareaFechaDeVencimiento());
            tareaSeleccionada.setUsuario(tareaActualizada.getUsuario());
            return tareaRepository.save(tareaSeleccionada);
        } else {
            System.out.println("La tarea no existe o el ID es incorrecto.");
            return null;
        }
    }
}