package org.generation.ejercicioapi.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "comentario")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long comentarioId;

    @NotNull
    private String comentarioTexto;

    @NotNull
    private Date comentarioFecha;

    @ManyToOne
    @JoinColumn(name = "tareaId", nullable = false)
    private Tarea tarea;
}
