package org.generation.ejercicioapi.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Entity
@Table(name = "usuario")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usuarioId;

    @NotNull
    private String nombreUsuario;

    @NotNull
    private String correoUsuario;


    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Tarea> tareaUsuario;

}
