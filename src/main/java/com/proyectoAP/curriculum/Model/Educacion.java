
package com.proyectoAP.curriculum.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Educacion")
@Getter @Setter
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_educacion")
    private Long id; 
    @Column(name="instituto")
    private String instituto;
    @Column(name="titulo")
    private String titulo;
    @Column(name="descripcion")
    private String descripcion;
    @Column(name="fecha_inicio")
    private String fecha_inicio;
    @Column(name="fecha_fin")
    private String fecha_fin;

    public Educacion() {
    }

    public Educacion(Long id, String instituto, String titulo, String descripcion, String fecha_inicio, String fecha_fin) {
        this.id = id;
        this.instituto = instituto;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }
    
    
}
