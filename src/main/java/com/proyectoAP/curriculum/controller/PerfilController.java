
package com.proyectoAP.curriculum.controller;

import com.proyectoAP.curriculum.Model.Perfil;
import com.proyectoAP.curriculum.service.IPerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins={"https://apfrontdiego.web.app/"})
@RequestMapping("/perfil")
public class PerfilController {
    
    @Autowired
    private IPerfilService perfServ;
    
    @GetMapping("/{id}")
    public Perfil getPerfil(@PathVariable Long id){
        return perfServ.getData(id);
    }
    
    @PutMapping("/editar")
    public void editPerfil(@RequestBody Perfil perfil){
        perfServ.editPerfil(perfil);
    }
    
}
