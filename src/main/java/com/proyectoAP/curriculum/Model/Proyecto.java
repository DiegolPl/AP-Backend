
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
@Table(name="Proyectos")
@Getter @Setter
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_proyecto")
    private Long id;
    @Column(name="titulo")
    private String titulo;
    @Column(name="fecha")
    private String fecha;
    @Column(name="url_imagen")
    private String url_imagen;
    @Column(name="link")
    private String link;
    @Column(name="descripcion")
    private String descripcion;

    public Proyecto() {
    }

    public Proyecto(Long id, String titulo, String fecha, String url_imagen, String link, String descripcion) {
        this.id = id;
        this.titulo = titulo;
        this.fecha = fecha;
        this.url_imagen = url_imagen;
        this.link = link;
        this.descripcion = descripcion;
    }
}
