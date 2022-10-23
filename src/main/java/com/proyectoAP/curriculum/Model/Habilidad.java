
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
@Table(name="Habilidades")
@Getter @Setter
public class Habilidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_habilidades")
    private Long id;
    @Column(name="habilidad")
    private String habilidad; 
    @Column(name="porcentaje")
    private int porcentaje;

    public Habilidad() {
    }

    public Habilidad(Long id, String habilidad, int porcentaje) {
        this.id = id;
        this.habilidad = habilidad;
        this.porcentaje = porcentaje;
    }
}
