package org.generation.ejercicioapi.controllers;

import org.generation.ejercicioapi.models.Tarea;
import org.generation.ejercicioapi.service.TareaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarea")
public class TareaRestController {

    @Autowired
    TareaServiceImpl tareaService;

    @GetMapping("/lista")
    public List<Tarea> listaDeTareas() {
        List<Tarea> listaMostrar = tareaService.listaDeTareas();
        return listaMostrar;
    }

    @PostMapping("/nuevo")
    public Tarea crearTarea(@RequestBody Tarea TareaNuevo) {
        return tareaService.guardarTarea(TareaNuevo);
    }

    @PutMapping("/editar")
    public Tarea editarTareaPorId(@RequestParam Long id, @RequestBody Tarea TareaActualizado) {
        Tarea TareaEditado = tareaService.editarTareaPorId(id, TareaActualizado);
        return TareaEditado;
    }


    @DeleteMapping("/borrar")
    public String borrarTareaPorId(@RequestParam Long id) {
        tareaService.borrarTarea(id);
        return "El tarea ha sido borrada";
    }
}
