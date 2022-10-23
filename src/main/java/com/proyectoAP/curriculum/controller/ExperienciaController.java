
package com.proyectoAP.curriculum.controller;

import com.proyectoAP.curriculum.Model.Experiencia;
import com.proyectoAP.curriculum.service.IExperienciaService;
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
//Lo siguiente lo debo poner para evitar error de CORS (angular)
@CrossOrigin(origins={"http://localhost:4200"})
@RequestMapping("/experiencias")
public class ExperienciaController {
    
    @Autowired
    private IExperienciaService expServ;
    
    
    @GetMapping("/listar")
    public List<Experiencia> mostrarExperiencias(){
        return expServ.getAllExperiencias();
    }
    
    @PostMapping("/crear")
    public void addExperiencia(@RequestBody Experiencia exp){
        expServ.addExperiencia(exp);
    }
    
    @PutMapping("/editar")
    public void editExperiencia(@RequestBody Experiencia exp){
        expServ.editExperiencia(exp);
    }
    
    @GetMapping("/exp/{id}")
    public Experiencia getExperiencia(@PathVariable Long id){
        return expServ.getExperiencia(id);
    }
    
    @DeleteMapping("/delete/{id}")
    public void deleteExperiencia(@PathVariable Long id){
        expServ.deleteExperiencia(id);
    }
}
