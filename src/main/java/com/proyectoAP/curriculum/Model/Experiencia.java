
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
@Table(name="Experiencia")
@Getter @Setter
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_experiencia")
    private Long id;
    @Column(name="lugar")
    private String lugar;
    @Column(name="ocupacion")
    private String ocupacion;
    @Column(name="fecha_inicio")
    private String fecha_inicio;
    @Column(name="fecha_fin")
    private String fecha_fin;
    @Column(name="descripcion")
    private String descripcion;

    public Experiencia() {
    }

    public Experiencia(Long id, String lugar, String ocupacion, String fecha_inicio, String fecha_fin, String descripcion) {
        this.id = id;
        this.lugar = lugar;
        this.ocupacion = ocupacion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.descripcion = descripcion;
    }
    
    
}
