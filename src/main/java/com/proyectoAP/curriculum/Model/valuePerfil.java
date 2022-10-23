/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoAP.curriculum.Model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter @Setter
public class valuePerfil {
    private String id;
    private String nombre;
    private String titulo;
    private String sobreMi;
    private MultipartFile archivo;

    public valuePerfil() {
    }

    public valuePerfil(String id, String nombre, String titulo, String sobreMi, MultipartFile archivo) {
        this.id = id;
        this.nombre = nombre;
        this.titulo = titulo;
        this.sobreMi = sobreMi;
        this.archivo = archivo;
    }
    
    
}
