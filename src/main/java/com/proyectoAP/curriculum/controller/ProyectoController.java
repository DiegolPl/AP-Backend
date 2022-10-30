
package com.proyectoAP.curriculum.controller;

import com.proyectoAP.curriculum.Model.Proyecto;
import com.proyectoAP.curriculum.service.ProyectoService;
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
@CrossOrigin(origins={"https://apfrontdiego.web.app/"})
@RequestMapping("/proyectos")
public class ProyectoController {
    
    @Autowired
    private ProyectoService proyServ;
    
    @GetMapping("/listar")
    public List<Proyecto> getAllProyectos(){
        return proyServ.getAllProyectos();
    }
    
    @GetMapping("/proyecto/{id}")
    public Proyecto getProyecto(@PathVariable Long id){
        return proyServ.getProyecto(id);
    }
    
    @PostMapping("/crear")
    public void addProyecto(@RequestBody Proyecto proyecto){
        proyServ.addProyecto(proyecto);
    }
    
    @PutMapping("/editar")
    public void editProyecto(@RequestBody Proyecto proyecto){
        proyServ.editProyecto(proyecto);
    }
    
    @DeleteMapping("/delete/{id}")
    public void deleteExperiencia(@PathVariable Long id){
        proyServ.deleteProyecto(id);
    }
}
