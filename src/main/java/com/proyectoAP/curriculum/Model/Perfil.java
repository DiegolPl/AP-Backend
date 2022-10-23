
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
@Table(name="Perfil")
@Getter @Setter
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_perfil")
    private Long id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="titulo")
    private String titulo;
    @Column(name="url_imagen")
    private String urlImg;
    @Column(name="sobre_mi")
    private String sobreMi;

    public Perfil() {
    }

    public Perfil(Long id, String nombre, String titulo, String urlImg, String sobreMi) {
        this.id = id;
        this.nombre = nombre;
        this.titulo = titulo;
        this.urlImg = urlImg;
        this.sobreMi = sobreMi;
    }

    
    
    
}
