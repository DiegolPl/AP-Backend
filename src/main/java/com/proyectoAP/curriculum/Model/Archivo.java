
package com.proyectoAP.curriculum.Model;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

//@Entity
@Getter @Setter
public class Archivo {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
    private String nombre;
    private String url;

    public Archivo() {
    }
 
    public Archivo(String nombre, String url) {
        this.nombre = nombre;
        this.url = url;
    }
    
    

//    public Archivo(Long id, String nombre, String url) {
//        this.id = id;
//        this.nombre = nombre;
//        this.url = url;
//    }

    public Archivo(String url) {
        this.url = url;
    }
    
}
