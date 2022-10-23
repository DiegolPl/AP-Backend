
package com.proyectoAP.curriculum.controller;

import com.proyectoAP.curriculum.Model.Educacion;
import com.proyectoAP.curriculum.service.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins={"http://localhost:4200"})
@RequestMapping("/educacion")
public class EducacionController {
    
    @Autowired
    private IEducacionService eduServ;
    
    @GetMapping("/listar")
    public List<Educacion> mostrarEducacions(){
        return eduServ.getAllEducacions();
    }
    
    @PostMapping("/crear")
    public void addEducacion(@RequestBody Educacion edu){
        eduServ.addEducacion(edu);
    }
    
    @PutMapping("/editar")
    public void editEducacion(@RequestBody Educacion edu){
        eduServ.editEducacion(edu);
    }
    
    @GetMapping("/edu/{id}")
    public Educacion getEducacion(@PathVariable Long id){
        return eduServ.getEducacion(id);
    }
    
    @DeleteMapping("/delete/{id}")
    public void deleteEducacion(@PathVariable Long id){
        eduServ.deleteEducacion(id);
    }
}
