
package com.proyectoAP.curriculum.controller;

import com.proyectoAP.curriculum.Model.Habilidad;
import com.proyectoAP.curriculum.service.HabilidadService;
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
@RequestMapping("/habilidades")
public class HabilidadController {
    
    @Autowired
    private HabilidadService habServ;
    
    @GetMapping("/listar")
    public List<Habilidad> getAllHabilidades(){
        return habServ.getAllHabilidades();
    }
    
    @GetMapping("/habilidad/{id}")
    public Habilidad getHabilidad(@PathVariable Long id){
        return habServ.getHabilidad(id);
    }
    
    @PostMapping("/crear")
    public void addHabilidad(@RequestBody Habilidad habilidad){
        habServ.addHabilidad(habilidad);
    }
    
    @PutMapping("/editar")
    public void editHabilidad(@RequestBody Habilidad habilidad){
        habServ.editHabilidad(habilidad);
    }
    
    @DeleteMapping("/delete/{id}")
    public void deleteHabilidad(@PathVariable Long id){
        habServ.deleteHabilidad(id);
    }
}
