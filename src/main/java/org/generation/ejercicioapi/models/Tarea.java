package org.generation.ejercicioapi.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tarea")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tareaId;

    @NotNull
    private String tareaTitulo;

    @NotNull
    private String tareaDescripcion;

    @NotNull
    private Date tareaFechaDeVencimiento;

    @ManyToOne
    @JoinColumn(name = "usuarioId", nullable = false)
    private Usuario usuario;

    @JsonIgnore
    @OneToMany(mappedBy = "tarea", cascade = CascadeType.ALL)
    private List<Comentario> comentarioTarea;
}
